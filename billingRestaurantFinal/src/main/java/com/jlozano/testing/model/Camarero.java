package com.jlozano.testing.model;

public class Camarero {
	
	private Integer idCamarero;    
	private String nombre;       
	private String apellido1;    
	private String apellido2;
	public Integer getIdCamarero() {
		return idCamarero;
	}
	public void setIdCamarero(Integer idCamarero) {
		this.idCamarero = idCamarero;
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
	
	@Override
	public String toString() {
		return "Camarero [idCamarero=" + idCamarero + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + "]";
	}    
	
	

}
