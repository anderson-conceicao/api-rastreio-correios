
package com.dev.apirastreiocorreios.model;

public class Destino {

    private String local;
    private String codigo;
    private String cidade;
    private String bairro;
    private String uf;
    private Endereco endereco;

   
    public Destino() {
    }

  
    public Destino(String local, String codigo, String cidade, String bairro, String uf, Endereco endereco) {
        super();
        this.local = local;
        this.codigo = codigo;
        this.cidade = cidade;
        this.bairro = bairro;
        this.uf = uf;
        this.endereco = endereco;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
