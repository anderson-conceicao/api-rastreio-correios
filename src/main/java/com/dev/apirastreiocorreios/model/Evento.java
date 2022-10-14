
package com.dev.apirastreiocorreios.model;

import java.util.List;


public class Evento {

    private String tipo;
    private String status;
    private String data;
    private String hora;
    private String criacao;
    private String descricao;
    private Recebedor recebedor;
    private Unidade unidade;
    private String cepDestino;
    private String prazoGuarda;
    private String diasUteis;
    private String dataPostagem;
    private DetalheOEC detalheOEC;
    private String detalhe;
    private List<Destino> destino = null;
    private Postagem postagem;

  
    public Evento() {
    }

 
    public Evento(String tipo, String status, String data, String hora, String criacao, String descricao, Recebedor recebedor, Unidade unidade, String cepDestino, String prazoGuarda, String diasUteis, String dataPostagem, DetalheOEC detalheOEC, String detalhe, List<Destino> destino, Postagem postagem) {
        super();
        this.tipo = tipo;
        this.status = status;
        this.data = data;
        this.hora = hora;
        this.criacao = criacao;
        this.descricao = descricao;
        this.recebedor = recebedor;
        this.unidade = unidade;
        this.cepDestino = cepDestino;
        this.prazoGuarda = prazoGuarda;
        this.diasUteis = diasUteis;
        this.dataPostagem = dataPostagem;
        this.detalheOEC = detalheOEC;
        this.detalhe = detalhe;
        this.destino = destino;
        this.postagem = postagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Recebedor getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(Recebedor recebedor) {
        this.recebedor = recebedor;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }

    public String getPrazoGuarda() {
        return prazoGuarda;
    }

    public void setPrazoGuarda(String prazoGuarda) {
        this.prazoGuarda = prazoGuarda;
    }

    public String getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(String diasUteis) {
        this.diasUteis = diasUteis;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public DetalheOEC getDetalheOEC() {
        return detalheOEC;
    }

    public void setDetalheOEC(DetalheOEC detalheOEC) {
        this.detalheOEC = detalheOEC;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public List<Destino> getDestino() {
        return destino;
    }

    public void setDestino(List<Destino> destino) {
        this.destino = destino;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

}
