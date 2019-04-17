package com.jlozano.testing.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jlozano.testing.model.Cliente;

public interface IClientsService {
	
		
	List<Cliente> buscarTodos();
	Cliente buscarPorId(int idCliente);
	List<String> buscarGeneros();
	// 
    List<Cliente> buscarActivas();	
	List<Cliente> buscarPorFecha(Date fecha);
	Page<Cliente> buscarTodas(Pageable page);	
	void eliminar(int idCliente);

}
