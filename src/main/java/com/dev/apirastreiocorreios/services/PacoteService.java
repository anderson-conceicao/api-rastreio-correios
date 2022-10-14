package com.dev.apirastreiocorreios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.apirastreiocorreios.clients.CorreiosClient;
import com.dev.apirastreiocorreios.model.Objeto;
import com.dev.apirastreiocorreios.model.Pacote;
import com.dev.apirastreiocorreios.model.Usuario;
import com.dev.apirastreiocorreios.model.dto.PacoteDTO;
import com.dev.apirastreiocorreios.repositories.PacoteRepository;
import com.dev.apirastreiocorreios.repositories.UsuarioRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

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
		Usuario usuario=usuarioRepository.findById(pacoteDTO.getUsuario()).get();
		Pacote pacote=pacoteToObjeto(buscarCorreios(pacoteDTO.getCodigo()));
		pacote.setUsuario(usuario);		
		return pacoteRepository.save(pacote);
		
	}
	
	public Pacote pacoteToObjeto(Objeto objeto) {		
		Pacote pacote= new Pacote();
		pacote.setCodigo(objeto.getNumero());
		pacote.setDescricao(objeto.toString());
		return pacote;
		
	}

}
