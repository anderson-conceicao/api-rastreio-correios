
package com.dev.apirastreiocorreios.model;

public class Postagem {

    private String cepdestino;
    private String ar;
    private String mp;
    private String dh;
    private String peso;
    private String volume;
    private String dataprogramada;
    private String datapostagem;
    private String prazotratamento;

   
    public Postagem() {
    }


    public Postagem(String cepdestino, String ar, String mp, String dh, String peso, String volume, String dataprogramada, String datapostagem, String prazotratamento) {
        super();
        this.cepdestino = cepdestino;
        this.ar = ar;
        this.mp = mp;
        this.dh = dh;
        this.peso = peso;
        this.volume = volume;
        this.dataprogramada = dataprogramada;
        this.datapostagem = datapostagem;
        this.prazotratamento = prazotratamento;
    }

    public String getCepdestino() {
        return cepdestino;
    }

    public void setCepdestino(String cepdestino) {
        this.cepdestino = cepdestino;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDataprogramada() {
        return dataprogramada;
    }

    public void setDataprogramada(String dataprogramada) {
        this.dataprogramada = dataprogramada;
    }

    public String getDatapostagem() {
        return datapostagem;
    }

    public void setDatapostagem(String datapostagem) {
        this.datapostagem = datapostagem;
    }

    public String getPrazotratamento() {
        return prazotratamento;
    }

    public void setPrazotratamento(String prazotratamento) {
        this.prazotratamento = prazotratamento;
    }

}
