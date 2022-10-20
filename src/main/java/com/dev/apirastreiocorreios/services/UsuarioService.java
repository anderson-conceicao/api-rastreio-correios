package com.dev.apirastreiocorreios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.apirastreiocorreios.exceptions.UsuarioNotFoundException;
import com.dev.apirastreiocorreios.model.Pacote;
import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.model.dto.UsuarioDTO;
import com.dev.apirastreiocorreios.repositories.PacoteRepository;
import com.dev.apirastreiocorreios.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PacoteRepository pacoteRepository;

	public List<UsuarioDTO> listar() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();

		for (Usuario usuario : usuarios) {

			UsuarioDTO usuarioDTO = new UsuarioDTO();
			List<String> pacotesUsuarioDTO = new ArrayList<>();

			usuarioDTO.setId(usuario.getId());
			usuarioDTO.setNome(usuario.getNome());
			List<Pacote> pacotes = usuario.getPacotes();

			for (Pacote pacote : pacotes) {
				pacotesUsuarioDTO.add(pacote.getCodigo());
			}
			usuarioDTO.setPacotes(pacotesUsuarioDTO);

			usuariosDTO.add(usuarioDTO);

		}

		return usuariosDTO;
	}

	
	public Usuario buscar(Long id) {
		return usuarioRepository.findById(id)
				.orElseThrow(()->new UsuarioNotFoundException("Usuário não encontrado"));
	}
	
	
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario atualizar(Usuario usuario) {
		Usuario obj = usuarioRepository.findById(usuario.getId()).get();
		if (obj == null) {
			throw new UsuarioNotFoundException("Usuário não encontrado");
		}
		obj.setId(obj.getId());
		obj.setNome(usuario.getNome());
		return usuarioRepository.save(obj);

	}	
	public void remover(Long id) {
		Usuario obj = usuarioRepository.findById(id).get();

		if (obj == null) {
			throw new UsuarioNotFoundException("Usuário não encontrado");
		}	
		List<Pacote>pacotesUsuario= pacoteRepository.findPacoteByUsuarioId(obj.getId());
		pacoteRepository.deleteAll(pacotesUsuario);
		usuarioRepository.delete(obj);
	}

}
