package com.myspace.poc_bancolombia;

/**
 * This class was automatically generated by the data modeler tool.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class PQRWrapper implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.myspace.poc_bancolombia.PQRs PQRs;

	public PQRWrapper() {
	}

    @JsonProperty("PQRs")
	public com.myspace.poc_bancolombia.PQRs getPQRs() {
		return this.PQRs;
	}

    @JsonProperty("PQRs")
	public void setPQRs(com.myspace.poc_bancolombia.PQRs PQRs) {
		this.PQRs = PQRs;
	}

	public PQRWrapper(com.myspace.poc_bancolombia.PQRs PQRs) {
		this.PQRs = PQRs;
	}

}