
package com.dev.apirastreiocorreios.model;

public class Endereco {

    private String codigo;
    private String cep;
    private String logradouro;
    private String numero;
    private String localidade;
    private String uf;
    private String bairro;
    private String latitude;
    private String longitude;
    private String complemento;

   
    public Endereco() {
    }



    public String getCodigo() {
        return codigo;
    }

    public Endereco(String codigo, String cep, String logradouro, String numero, String localidade, String uf,
			String bairro, String latitude, String longitude, String complemento) {
		super();
		this.codigo = codigo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.localidade = localidade;
		this.uf = uf;
		this.bairro = bairro;
		this.latitude = latitude;
		this.longitude = longitude;
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
