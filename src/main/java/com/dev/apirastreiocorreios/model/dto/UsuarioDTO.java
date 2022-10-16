package com.dev.apirastreiocorreios.model.dto;

import java.util.List;

import lombok.Data;
@Data
public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private List<String> pacotes;

}
