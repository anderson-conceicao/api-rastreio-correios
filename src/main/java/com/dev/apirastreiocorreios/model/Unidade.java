
package com.dev.apirastreiocorreios.model;

import lombok.Data;

@Data
public class Unidade {

	private String local;
	private String codigo;
	private String cidade;
	private String uf;
	private String sto;
	private String tipounidade;
	private Endereco endereco;

}
