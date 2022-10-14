package com.dev.apirastreiocorreios.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pacote {
	@Id
	private String codigo;
	private String descricao;

}
