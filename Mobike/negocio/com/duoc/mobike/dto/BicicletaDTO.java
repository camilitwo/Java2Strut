package com.duoc.mobike.dto;

import java.io.Serializable;

public class BicicletaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double idBicicleta;
	private String estado;

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(double idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

}
