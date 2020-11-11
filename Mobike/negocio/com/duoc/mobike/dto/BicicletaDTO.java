package com.duoc.mobike.dto;

import java.io.Serializable;

public class BicicletaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idBicicleta;
	private String estado;
	public int getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
