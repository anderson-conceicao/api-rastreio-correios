package com.dev.apirastreiocorreios.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.apirastreiocorreios.model.Pacote;

public interface PacoteRepository extends JpaRepository<Pacote, String> {
	
	List<Pacote> findPacoteByUsuarioId(Long id);
}
