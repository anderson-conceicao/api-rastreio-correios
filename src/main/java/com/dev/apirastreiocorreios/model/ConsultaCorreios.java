
package com.dev.apirastreiocorreios.model;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaCorreios {

    private String versao;
    private String quantidade;
    private String pesquisa;
    private String resultado;
    private List<Objeto> objeto ;

    
   
}
