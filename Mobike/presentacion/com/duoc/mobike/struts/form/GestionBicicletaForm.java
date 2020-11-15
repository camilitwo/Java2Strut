package com.duoc.mobike.struts.form;


public class GestionBicicletaForm extends org.apache.struts.action.ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8161761735922079190L;
	private String valorTexto;
	private String prueba2;
	private String opciones;
	private String alertas;
	
	public String getValorTexto() {
		return valorTexto;
	}
	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}
	public String getPrueba2() {
		return prueba2;
	}
	public void setPrueba2(String prueba2) {
		this.prueba2 = prueba2;
	}
	public String getOpciones() {
		return opciones;
	}
	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}
	public String getAlertas() {
		return alertas;
	}
	public void setAlertas(String alertas) {
		this.alertas = alertas;
	}

}
