package com.jlozano.testing.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jlozano.testing.model.Cliente;
import com.jlozano.testing.repository.ClientsRepository;

import net.itinajero.app.repository.PeliculasRepository;

@Service
public class ClientsServiceJPA implements IClientsService {
	
    @Autowired
	private ClientsRepository clientsRepo;

	

	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cliente> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}



}
