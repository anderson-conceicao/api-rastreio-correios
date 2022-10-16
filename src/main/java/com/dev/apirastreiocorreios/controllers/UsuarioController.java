package com.dev.apirastreiocorreios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	ResponseEntity<List<UsuarioDTO>> listar(){
		return ResponseEntity.ok(usuarioService.listar());
		
	}
	
	
	@PostMapping
	ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
		return ResponseEntity.ok(usuarioService.salvar(usuario));
	}
	


}
