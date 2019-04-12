package com.jlozano.testing.model;

public class Cliente {
	
	private Integer idCliente;    
	private String nombre;       
	private String apellido1;    
	private String apellido2;    
	private String observaciones;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", observaciones=" + observaciones + "]";
	}

	
}
