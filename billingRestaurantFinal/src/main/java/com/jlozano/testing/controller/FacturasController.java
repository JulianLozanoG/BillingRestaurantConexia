package com.jlozano.testing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jlozano.testing.model.DetalleFactura;
import com.jlozano.testing.model.Factura;
import com.jlozano.testing.service.IDetallesfacturaService;
import com.jlozano.testing.service.IFacturasService;

@Controller
@RequestMapping(value = "/facturas")
public class FacturasController {

	// Inyectamos una instancia desde el Root ApplicationContext
	@Autowired
	private IDetallesfacturaService serviceDetalles;

	// Inyectamos una instancia desde el Root ApplicationContext
	@Autowired
	private IFacturasService serviceFacturas;

	/**
	 * Metodo que muestra la lista de facturas que se encuentran en base de datos
	 */
	@GetMapping(value = "/index")
	public String mostrarIndex(Model model) {
		List<Factura> lista = serviceFacturas.buscarTodas();
		model.addAttribute("facturas", lista);
		return "facturas/listFacturas";
	}

	/**
	 * Metodo para mostrar el formulario de creación de una factura
	 * 
	 */
	@GetMapping(value = "/crear")
	public String crear(@ModelAttribute Factura factura) {		
		return "facturas/formFactura";
	}
	
	
	/**
	 * Metodo para guardar los datos de la factura
	 */
	@PostMapping(value = "/guardarFactura")
	public String guardarfac(@ModelAttribute Factura factura, DetalleFactura detalleFactura, BindingResult result,
			Model model, HttpServletRequest request, RedirectAttributes attributes) {

		if (result.hasErrors()) {

			System.out.println("Existieron errores");
			return "facturas/formFactura";
		}

		// Primero insertamos el detalle de la factura
		serviceDetalles.insertar(detalleFactura);

		// Como el Detalle ya tiene id, ya podemos guardar la factura
		serviceFacturas.insertar(factura);
		attributes.addFlashAttribute("msg", "Los datos de la factura se registraron correctamente!");

		return "redirect:/facturas/indexPaginate";
	}

}
