
package com.dev.apirastreiocorreios.model;

import java.util.List;

import lombok.Data;

@Data
public class Objeto {

    private String numero;
    private String sigla;
    private String nome;
    private String categoria;
    private List<Evento> evento;

 
  

}
