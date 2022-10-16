package com.dev.apirastreiocorreios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.apirastreiocorreios.model.Pacote;
import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.model.dto.UsuarioDTO;
import com.dev.apirastreiocorreios.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioDTO> listar() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioDTO> usuariosDTO = new ArrayList<UsuarioDTO>();

		for (Usuario usuario : usuarios) {

			UsuarioDTO usuarioDTO = new UsuarioDTO();
			List<String> pacotesUsuarioDTO = new ArrayList<String>();
			
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

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
