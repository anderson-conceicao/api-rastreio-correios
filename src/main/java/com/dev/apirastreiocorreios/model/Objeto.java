
package com.dev.apirastreiocorreios.model;

import java.util.List;


public class Objeto {

    private String numero;
    private String sigla;
    private String nome;
    private String categoria;
    private List<Evento> evento = null;

 
    public Objeto() {
    }


    public Objeto(String numero, String sigla, String nome, String categoria, List<Evento> evento) {
        super();
        this.numero = numero;
        this.sigla = sigla;
        this.nome = nome;
        this.categoria = categoria;
        this.evento = evento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Evento> getEvento() {
        return evento;
    }

    public void setEvento(List<Evento> evento) {
        this.evento = evento;
    }

}
