package com.jlozano.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlozano.testing.model.DetalleFactura;

public interface DetallesFacturasRepository extends JpaRepository<DetalleFactura, Integer> {

}
