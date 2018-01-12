package br.com.nextel.architecture.model.valueobject;

import java.io.StringReader;

/**
 * @author Ricardo Amorim Rodrigues
 *
 */
public class ValueObjectJson {

	private String API_NAME = "";
	private String cdRetorno = "";
	private String token_type;
	private String access_token;
	private String expires_in;
	private String mensagemRetornoGenerica;
	private StringReader responseJsonByStringReader;

	public String getAPI_NAME() {
		return this.API_NAME;
	}

	public void setAPI_NAME(String aPI_NAME) {
		this.API_NAME = aPI_NAME;
	}

	public String getCdRetorno() {
		return this.cdRetorno;
	}

	public void setCdRetorno(String cdRetorno) {
		this.cdRetorno = cdRetorno;
	}

	public String getToken_type() {
		return this.token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getAccess_token() {
		if (this.access_token != null)
			return "Bearer " + this.access_token;

		return this.access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpires_in() {
		return this.expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	public StringReader getResponseJsonByStringReader() {
		return this.responseJsonByStringReader;
	}

	public void setResponseJsonByStringReader(StringReader responseJsonByStringReader) {
		this.responseJsonByStringReader = responseJsonByStringReader;
	}

	public String getMensagemRetornoGenerica() {
		return this.mensagemRetornoGenerica;
	}

	public void setMensagemRetornoGenerica(String mensagemRetornoGenerica) {
		this.mensagemRetornoGenerica = mensagemRetornoGenerica;
	}
}