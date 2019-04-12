package com.jlozano.testing.model;

public class DetalleFactura {
	
	
	private Integer idFactura;    
	private Integer idDetalleFactura;       
	private Integer idCocinero;    
	private String plato;    
	private Integer importe;
	
	public Integer getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}
	public Integer getIdDetalleFactura() {
		return idDetalleFactura;
	}
	public void setIdDetalleFactura(Integer idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}
	public Integer getIdCocinero() {
		return idCocinero;
	}
	public void setIdCocinero(Integer idCocinero) {
		this.idCocinero = idCocinero;
	}
	public String getPlato() {
		return plato;
	}
	public void setPlato(String plato) {
		this.plato = plato;
	}
	public Integer getImporte() {
		return importe;
	}
	public void setImporte(Integer importe) {
		this.importe = importe;
	}
	
	@Override
	public String toString() {
		return "DetalleFactura [idFactura=" + idFactura + ", idDetalleFactura=" + idDetalleFactura + ", idCocinero="
				+ idCocinero + ", plato=" + plato + ", importe=" + importe + "]";
	}
	
	

}
