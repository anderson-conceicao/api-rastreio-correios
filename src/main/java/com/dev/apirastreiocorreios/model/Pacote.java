package com.dev.apirastreiocorreios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Pacote {

	
	@Id
	private String codigo;
	@Column(columnDefinition="TEXT")
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	@JsonIgnore
	private Usuario usuario;

}
