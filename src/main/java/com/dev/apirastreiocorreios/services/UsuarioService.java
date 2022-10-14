package com.dev.apirastreiocorreios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listar(){		
		return usuarioRepository.findAll();
	}

}
