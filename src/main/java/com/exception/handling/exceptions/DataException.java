package com.exception.handling.exceptions;

import org.springframework.validation.Errors;

import lombok.Getter;

@Getter
public class DataException extends RuntimeException {

	private final Errors errors;
	
	public DataException(String message, Errors errors) {
		super(message);
		this.errors = errors;
	}

}
