package com.dev.apirastreiocorreios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.model.dto.UsuarioDTO;
import com.dev.apirastreiocorreios.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	ResponseEntity<List<UsuarioDTO>> listar() {
		return ResponseEntity.ok(usuarioService.listar());

	}

	@PostMapping
	ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.salvar(usuario));
	}

	@PutMapping
	ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.atualizar(usuario));
	}

	@DeleteMapping("/{id}")
	ResponseEntity<Void> remover(@PathVariable Long id) {
		usuarioService.remover(id);
		return ResponseEntity.noContent().build();

	}

}
