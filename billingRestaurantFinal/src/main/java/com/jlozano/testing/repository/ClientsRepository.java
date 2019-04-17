package com.jlozano.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlozano.testing.model.Cliente;


public interface ClientsRepository extends JpaRepository<Cliente, Integer> {
	
	//public List<Cliente> findByEstatus_OrderByidCliente(String nombre);

}
