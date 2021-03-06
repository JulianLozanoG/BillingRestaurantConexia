package com.jlozano.testing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FACTURA")
public class Factura {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="course_seq")
	private Integer idFactura;    
	private Integer idCliente;       
	private Integer idCamarero;    
	private Integer idMesa;    
	private Date fechaFactura;
	
	public Integer getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdCamarero() {
		return idCamarero;
	}
	public void setIdCamarero(Integer idCamarero) {
		this.idCamarero = idCamarero;
	}
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", idCliente=" + idCliente + ", idCamarero=" + idCamarero
				+ ", idMesa=" + idMesa + ", fechaFactura=" + fechaFactura + "]";
	}
	
	
	
	
}
