package com.dev.apirastreiocorreios.model.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PacoteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigo;
	private Long usuario;

}
