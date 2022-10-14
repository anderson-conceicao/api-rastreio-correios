
package com.dev.apirastreiocorreios.model;

import lombok.Data;

@Data
public class Endereco {

    private String codigo;
    private String cep;
    private String logradouro;
    private String numero;
    private String localidade;
    private String uf;
    private String bairro;
    private String latitude;
    private String longitude;
    private String complemento;

   
   

}
