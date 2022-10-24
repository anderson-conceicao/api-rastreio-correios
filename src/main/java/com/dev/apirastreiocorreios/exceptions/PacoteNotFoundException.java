package com.dev.apirastreiocorreios.exceptions;

public class PacoteNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public PacoteNotFoundException(String msg) {
		super(msg);
	}

}
