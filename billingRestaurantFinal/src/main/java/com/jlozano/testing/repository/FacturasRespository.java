package com.jlozano.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlozano.testing.model.Factura;

public interface FacturasRespository extends JpaRepository<Factura, Integer> {

}
