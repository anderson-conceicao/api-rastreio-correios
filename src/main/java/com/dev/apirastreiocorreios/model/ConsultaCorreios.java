
package com.dev.apirastreiocorreios.model;

import java.util.List;


public class ConsultaCorreios {

    private String versao;
    private String quantidade;
    private String pesquisa;
    private String resultado;
    private List<Objeto> objeto ;

    
    public ConsultaCorreios() {
    }


    public ConsultaCorreios(String versao, String quantidade, String pesquisa, String resultado, List<Objeto> objeto) {
        super();
        this.versao = versao;
        this.quantidade = quantidade;
        this.pesquisa = pesquisa;
        this.resultado = resultado;
        this.objeto = objeto;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public List<Objeto> getObjeto() {
        return objeto;
    }

    public void setObjeto(List<Objeto> objeto) {
        this.objeto = objeto;
    }

}
