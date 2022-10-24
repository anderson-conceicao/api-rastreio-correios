package com.dev.apirastreiocorreios.model.dto;

import java.io.Serializable;

import com.dev.apirastreiocorreios.model.Evento;

import lombok.Data;

@Data
public class PacoteResumoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigo;
	private Long usuario;
	private Evento evento;

}
