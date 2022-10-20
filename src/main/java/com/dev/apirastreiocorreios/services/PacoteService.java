package com.dev.apirastreiocorreios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.apirastreiocorreios.clients.CorreiosClient;
import com.dev.apirastreiocorreios.exceptions.ObjetoJaCadastradoException;
import com.dev.apirastreiocorreios.exceptions.UsuarioNotFoundException;
import com.dev.apirastreiocorreios.model.Objeto;
import com.dev.apirastreiocorreios.model.Pacote;
import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.model.dto.PacoteDTO;
import com.dev.apirastreiocorreios.repositories.PacoteRepository;
import com.dev.apirastreiocorreios.repositories.UsuarioRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;

@Service
public class PacoteService {

	@Autowired
	private PacoteRepository pacoteRepository;

	@Autowired
	private CorreiosClient correiosClient;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Objeto buscarCorreios(String codigo) throws JsonMappingException, JsonProcessingException {		
		return correiosClient.buscaCorreios(codigo).getBody();

	}
	@Transactional
	public Pacote salvar(PacoteDTO pacoteDTO) throws JsonMappingException, JsonProcessingException {
		
		Optional<Usuario> usuario=usuarioRepository.findById(pacoteDTO.getUsuario());
		
		if(usuario.isEmpty()) {
			throw new UsuarioNotFoundException("Usuário não encontrado");
		}
		
		Pacote pacote=pacoteToObjeto(buscarCorreios(pacoteDTO.getCodigo()));
		
		if(pacoteRepository.verifaPacoteExistente(pacote.getCodigo(), usuario.get().getId()).isPresent()) {
			throw new ObjetoJaCadastradoException("Objeto já está cadastrado para esse usuário!");
		}
		
		pacote.setUsuario(usuario.get());		
		return pacoteRepository.save(pacote);
		
	}
	
	public List<Pacote> listar(){
		return pacoteRepository.findAll();
	}
	
	public List<Pacote> bucarPacotesPorUsuario(Long id){
		return pacoteRepository.findPacoteByUsuarioId(id);
	}

	public Pacote pacoteToObjeto(Objeto objeto) {		
		Pacote pacote= new Pacote();
		pacote.setCodigo(objeto.getNumero());		
		pacote.setDescricao(new Gson().toJson(objeto));
		return pacote;
		
	}

}
