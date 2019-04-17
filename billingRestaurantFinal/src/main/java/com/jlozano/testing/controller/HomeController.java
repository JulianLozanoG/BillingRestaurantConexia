package com.jlozano.testing.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jlozano.testing.model.Cliente;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String inicio() {

		return "home";
	}

	@RequestMapping(value = "detail")
	public String showClients(Model model) {
		Integer idCliente = 1;
		String nombre = "JULIAN";
		String apellido1 = "LOZANO";
		String apellido2 = "GONZALEZ";
		String observaciones = "Buena antencion";

		model.addAttribute("idCliente", idCliente);
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido1", apellido1);
		model.addAttribute("apellido2", apellido2);
		model.addAttribute("observaciones", observaciones);

		return "detailClients";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPrincipal(Model model) {

		List<Cliente> clientes = getList();
		// clientes.add("JUAN");
		// clientes.add("FERNANDO");
		model.addAttribute("clientes", clientes);

		return "home";
	}

	//Metodo para generar una lisra de objetos del modelo Cliente
	private List<Cliente> getList() {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		List<Cliente> lista = null;
		try {
			lista = new LinkedList<>();

			Cliente cliente1 = new Cliente();
			cliente1.setIdCliente(1);
			cliente1.setNombre("DARIO");
			cliente1.setApellido1("BELLO");
			cliente1.setApellido2("FAJARDO");
			cliente1.setObservaciones("BUEN TRATO");

			Cliente cliente2 = new Cliente();
			cliente2.setIdCliente(2);
			cliente2.setNombre("MANUEL");
			cliente2.setApellido1("VELAZCO");
			cliente2.setApellido2("NIETO");
			cliente2.setObservaciones("BUEN TRATO");

			// Se agregan los nuevos objetos a la lista
			lista.add(cliente1);
			lista.add(cliente2);

			return lista;

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			return null;
		}

	}

}
