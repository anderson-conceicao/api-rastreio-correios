package com.dev.apirastreiocorreios.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dev.apirastreiocorreios.exceptions.ObjetoJaCadastradoException;
import com.dev.apirastreiocorreios.exceptions.UsuarioNotFoundException;

@ControllerAdvice
public class RessourceExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StandardError> usuarioNotFoundException(UsuarioNotFoundException e,
			HttpServletRequest request){
		StandardError error= new StandardError();
		error.setTimestamp(Instant.now());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setPath(request.getRequestURI());
		error.setError(e.getLocalizedMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
	@ExceptionHandler
	public ResponseEntity<StandardError> objetoJaCadastradoException(ObjetoJaCadastradoException e,
			HttpServletRequest request){
		StandardError error= new StandardError();
		error.setTimestamp(Instant.now());
		error.setStatus(HttpStatus.FORBIDDEN.value());
		error.setMessage(e.getMessage());
		error.setPath(request.getRequestURI());
		error.setError(e.getLocalizedMessage());
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(error);
	}

}
