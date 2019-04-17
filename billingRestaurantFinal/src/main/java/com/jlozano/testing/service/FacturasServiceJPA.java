package com.jlozano.testing.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jlozano.testing.model.Factura;

@Service
public class FacturasServiceJPA implements IFacturasService {
	
	
	private List<Factura> lista = null; 

	@Override
	public void insertar(Factura factura) {
		lista.add(factura);

	}

	@Override
	public List<Factura> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Factura> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
