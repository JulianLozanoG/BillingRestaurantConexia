package com.jlozano.testing.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jlozano.testing.model.DetalleFactura;

public class DetalleFacturasServiceJPA implements IDetallesfacturaService {

	@Override
	public void insertar(DetalleFactura detalleFactura) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DetalleFactura> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DetalleFactura> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
