package com.jlozano.testing.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.jlozano.testing.model.DetalleFactura;


public interface IDetallesfacturaService {
	
	void insertar(DetalleFactura detalleFactura);	
	List<DetalleFactura> buscarTodas();
	Page<DetalleFactura> buscarTodas(Pageable page);	

}
