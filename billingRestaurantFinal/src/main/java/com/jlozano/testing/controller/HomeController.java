package com.jlozano.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String inicio(){
		
		return "home";
	}
	
	@RequestMapping(value="detail")
	public String showClients (Model model) {
	Integer	idCliente = 1;    
	String  nombre = "JULIAN";       
	String  apellido1 = "LOZANO";
	String  apellido2 = "GONZALEZ";    
	String  observaciones = "Buena antencion";
	
	model.addAttribute("idCliente", idCliente);
	model.addAttribute("nombre", nombre);
	model.addAttribute("apellido1", apellido1);
	model.addAttribute("apellido2", apellido2);
	model.addAttribute("observaciones", observaciones);
	
	return "detailClients";

	}
}
