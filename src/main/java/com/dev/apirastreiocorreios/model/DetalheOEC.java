
package com.dev.apirastreiocorreios.model;

public class DetalheOEC {

    private String carteiro;
    private String distrito;
    private String lista;
    private String unidade;

    
    public DetalheOEC() {
    }

 
    public DetalheOEC(String carteiro, String distrito, String lista, String unidade) {
        super();
        this.carteiro = carteiro;
        this.distrito = distrito;
        this.lista = lista;
        this.unidade = unidade;
    }

    public String getCarteiro() {
        return carteiro;
    }

    public void setCarteiro(String carteiro) {
        this.carteiro = carteiro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

}
