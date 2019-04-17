package com.jlozano.testing.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jlozano.testing.model.Factura;


public interface IFacturasService {

	void insertar(Factura factura);	
	List<Factura> buscarTodas();
	Page<Factura> buscarTodas(Pageable page);
	
	
	
}
