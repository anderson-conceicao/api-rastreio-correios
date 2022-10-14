
package com.dev.apirastreiocorreios.model;

import lombok.Data;

@Data
public class Destino {

    private String local;
    private String codigo;
    private String cidade;
    private String bairro;
    private String uf;
    private Endereco endereco;

   
    

}
