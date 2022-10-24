package com.dev.apirastreiocorreios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.apirastreiocorreios.model.Pacote;
import com.dev.apirastreiocorreios.model.dto.PacoteDTO;
import com.dev.apirastreiocorreios.model.dto.PacoteResumoDTO;
import com.dev.apirastreiocorreios.services.PacoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {

	@Autowired
	private PacoteService pacoteService;

	@GetMapping("/{codigo}")
	ResponseEntity<?> buscaPacote(@PathVariable String codigo) throws JsonMappingException, JsonProcessingException {
		return ResponseEntity.ok(pacoteService.buscarCorreios(codigo));

	}

	@GetMapping("/usuario/{id}")
	ResponseEntity<List<Pacote>> buscaPacotePorUsuarioDetalhe(@PathVariable Long id) {
		return ResponseEntity.ok(pacoteService.bucarPacotesPorUsuario(id));

	}
	
	@PostMapping("/resumo")
	ResponseEntity<PacoteResumoDTO> buscaPacotePorUsuarioResumo(@RequestBody PacoteDTO pacote) throws JsonMappingException, JsonProcessingException {
		return ResponseEntity.ok(pacoteService.buscarPacoteResumo(pacote));

	}
	
	@PostMapping
	ResponseEntity<Pacote> salvarPacoteUsuario(@RequestBody PacoteDTO pacote) throws JsonMappingException, JsonProcessingException {
		return ResponseEntity.ok(pacoteService.salvar(pacote));
	}
	
	@DeleteMapping
	ResponseEntity<Void> deletarPacoteUsuario(@RequestBody PacoteDTO pacote) throws JsonMappingException, JsonProcessingException {
		pacoteService.deletar(pacote);
		return ResponseEntity.noContent().build();
	}

}
