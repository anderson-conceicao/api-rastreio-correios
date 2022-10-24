package com.dev.apirastreiocorreios.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.apirastreiocorreios.model.Pacote;

public interface PacoteRepository extends JpaRepository<Pacote, String> {
	
	List<Pacote> findPacoteByUsuarioId(Long id);
	
	@Query("SELECT p FROM Pacote p WHERE p.codigo=?1  AND p.usuario.id =?2 ")
	Optional<Pacote> verifaPacoteExistente(String codigoPacote, Long idUsuario);

	
}
