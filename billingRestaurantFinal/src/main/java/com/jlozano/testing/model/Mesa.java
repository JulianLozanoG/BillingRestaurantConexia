package com.jlozano.testing.model;

public class Mesa {

	private Integer idMesa;    
	private Integer numMaxComensales;       
	private String Ubicacion;
	
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public Integer getNumMaxComensales() {
		return numMaxComensales;
	}
	public void setNumMaxComensales(Integer numMaxComensales) {
		this.numMaxComensales = numMaxComensales;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", numMaxComensales=" + numMaxComensales + ", Ubicacion=" + Ubicacion + "]";
	}    
	
	
	
	
}
