
package com.dev.apirastreiocorreios.model;

import java.util.List;

import lombok.Data;
@Data
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
	private List<Destino> destino;
	private Postagem postagem;

}
