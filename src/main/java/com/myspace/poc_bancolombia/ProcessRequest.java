package com.myspace.poc_bancolombia;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ProcessRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String tipoIdentificacion;
	private java.lang.String numeroIdentificacion;
	private java.lang.String claseOperacion;
	private java.lang.String tipologia;

	public ProcessRequest() {
	}

	public java.lang.String getTipoIdentificacion() {
		return this.tipoIdentificacion;
	}

	public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public java.lang.String getNumeroIdentificacion() {
		return this.numeroIdentificacion;
	}

	public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public java.lang.String getClaseOperacion() {
		return this.claseOperacion;
	}

	public void setClaseOperacion(java.lang.String claseOperacion) {
		this.claseOperacion = claseOperacion;
	}

	public java.lang.String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(java.lang.String tipologia) {
		this.tipologia = tipologia;
	}
	
	public ProcessRequest(java.lang.String tipoIdentificacion,
			java.lang.String numeroIdentificacion,
			java.lang.String claseOperacion, java.lang.String tipologia) {
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.claseOperacion = claseOperacion;
		this.tipologia = tipologia;
	}

}