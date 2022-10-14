package com.dev.apirastreiocorreios.services;

import java.util.List;

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
		Usuario usuario=usuarioRepository.findById(pacoteDTO.getUsuario()).get();
		Pacote pacote=pacoteToObjeto(buscarCorreios(pacoteDTO.getCodigo()));
		pacote.setUsuario(usuario);		
		return pacoteRepository.save(pacote);
		
	}
	
	public List<Pacote> listar(){
		return pacoteRepository.findAll();
	}
	
	public List<Pacote> bucarPacotesPorUsuario(Long id){
		return pacoteRepository.findPacoteByUsuarioId(id);
	}
	
	
//	public Objeto descricaoToObjeto(String descricao) throws JsonMappingException, JsonProcessingException {
//		ObjectMapper objectMapper = new ObjectMapper();		
//		return objectMapper.readValue(descricao, Objeto.class);
//		
//	}
	
	public Pacote pacoteToObjeto(Objeto objeto) {		
		Pacote pacote= new Pacote();
		pacote.setCodigo(objeto.getNumero());		
		pacote.setDescricao(new Gson().toJson(objeto));
		return pacote;
		
	}

}
