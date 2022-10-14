
package com.dev.apirastreiocorreios.model;

public class Unidade {

    private String local;
    private String codigo;
    private String cidade;
    private String uf;
    private String sto;
    private String tipounidade;
    private Endereco endereco;

   
    public Unidade() {
    }

 
    public Unidade(String local, String codigo, String cidade, String uf, String sto, String tipounidade, Endereco endereco) {
        super();
        this.local = local;
        this.codigo = codigo;
        this.cidade = cidade;
        this.uf = uf;
        this.sto = sto;
        this.tipounidade = tipounidade;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public String getTipounidade() {
        return tipounidade;
    }

    public void setTipounidade(String tipounidade) {
        this.tipounidade = tipounidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
