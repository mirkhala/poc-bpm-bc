package com.myspace.poc_bancolombia;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PQRRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String tipoIdentificacion;
	private java.lang.String numeroIdentificacion;
	private java.lang.String entidad;
	private java.lang.String productoCanal;
	private java.lang.String tipologia;
	private java.lang.String usuarioReporta;
	private java.lang.String cantidadTransacciones;
	private java.lang.String valorSolicitado;
	private java.lang.String valorNoEntregado;
	private java.lang.String fechaTransaccion;
	private java.lang.String numeroProducto;
	private java.lang.String usuarioRealizaTransaccion;
	private java.lang.String descripcionPQR;

	public PQRRequest() {
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

	public java.lang.String getEntidad() {
		return this.entidad;
	}

	public void setEntidad(java.lang.String entidad) {
		this.entidad = entidad;
	}

	public java.lang.String getProductoCanal() {
		return this.productoCanal;
	}

	public void setProductoCanal(java.lang.String productoCanal) {
		this.productoCanal = productoCanal;
	}

	public java.lang.String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(java.lang.String tipologia) {
		this.tipologia = tipologia;
	}

	public java.lang.String getUsuarioReporta() {
		return this.usuarioReporta;
	}

	public void setUsuarioReporta(java.lang.String usuarioReporta) {
		this.usuarioReporta = usuarioReporta;
	}

	public java.lang.String getCantidadTransacciones() {
		return this.cantidadTransacciones;
	}

	public void setCantidadTransacciones(java.lang.String cantidadTransacciones) {
		this.cantidadTransacciones = cantidadTransacciones;
	}

	public java.lang.String getValorSolicitado() {
		return this.valorSolicitado;
	}

	public void setValorSolicitado(java.lang.String valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}

	public java.lang.String getValorNoEntregado() {
		return this.valorNoEntregado;
	}

	public void setValorNoEntregado(java.lang.String valorNoEntregado) {
		this.valorNoEntregado = valorNoEntregado;
	}

	public java.lang.String getFechaTransaccion() {
		return this.fechaTransaccion;
	}

	public void setFechaTransaccion(java.lang.String fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public java.lang.String getNumeroProducto() {
		return this.numeroProducto;
	}

	public void setNumeroProducto(java.lang.String numeroProducto) {
		this.numeroProducto = numeroProducto;
	}

	public java.lang.String getUsuarioRealizaTransaccion() {
		return this.usuarioRealizaTransaccion;
	}

	public void setUsuarioRealizaTransaccion(
			java.lang.String usuarioRealizaTransaccion) {
		this.usuarioRealizaTransaccion = usuarioRealizaTransaccion;
	}

	public java.lang.String getDescripcionPQR() {
		return this.descripcionPQR;
	}

	public void setDescripcionPQR(java.lang.String descripcionPQR) {
		this.descripcionPQR = descripcionPQR;
	}

	public PQRRequest(java.lang.String tipoIdentificacion,
			java.lang.String numeroIdentificacion, java.lang.String entidad,
			java.lang.String productoCanal, java.lang.String tipologia,
			java.lang.String usuarioReporta,
			java.lang.String cantidadTransacciones,
			java.lang.String valorSolicitado,
			java.lang.String valorNoEntregado,
			java.lang.String fechaTransaccion, java.lang.String numeroProducto,
			java.lang.String usuarioRealizaTransaccion,
			java.lang.String descripcionPQR) {
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.entidad = entidad;
		this.productoCanal = productoCanal;
		this.tipologia = tipologia;
		this.usuarioReporta = usuarioReporta;
		this.cantidadTransacciones = cantidadTransacciones;
		this.valorSolicitado = valorSolicitado;
		this.valorNoEntregado = valorNoEntregado;
		this.fechaTransaccion = fechaTransaccion;
		this.numeroProducto = numeroProducto;
		this.usuarioRealizaTransaccion = usuarioRealizaTransaccion;
		this.descripcionPQR = descripcionPQR;
	}

}