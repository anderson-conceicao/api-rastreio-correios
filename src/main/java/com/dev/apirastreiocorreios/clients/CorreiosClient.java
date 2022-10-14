package com.dev.apirastreiocorreios.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dev.apirastreiocorreios.model.ConsultaCorreios;
import com.dev.apirastreiocorreios.model.Objeto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CorreiosClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	public ResponseEntity<Objeto> buscaCorreios(String codigo) throws JsonMappingException, JsonProcessingException {
		String uri = "http://webservice.correios.com.br/service/rest/rastro/rastroMobile";
		String body = "<rastroObjeto>\r\n" +
		              "<usuario>XXXXXX</usuario>\r\n"
				    + "<senha>XXXXXX</senha>\r\n" + 
		              "<tipo>L</tipo>\r\n"
				    + "<resultado>T</resultado>\r\n" +
		              "<objetos>" + codigo.toUpperCase() + "</objetos>\r\n"
				   +  "<lingua>101</lingua>\r\n" +
		              "<token>XXXXXX</token>\r\n" +
				      "</rastroObjeto>";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> request = new HttpEntity<String>(body, headers);
		ResponseEntity<String>  response = restTemplate.postForEntity(uri, request, String.class);
		ObjectMapper objectMapper = new ObjectMapper();		
		ConsultaCorreios consulta = objectMapper.readValue(response.getBody(), ConsultaCorreios.class);
		
		return ResponseEntity.ok(consulta.getObjeto().get(0));

	}

}
