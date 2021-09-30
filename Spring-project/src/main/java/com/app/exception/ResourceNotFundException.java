package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFundException extends RuntimeException {
 
	private static final long serialVersionUID=1L;
	
	public ResourceNotFundException(String message)
	{
		super(message);
	}

}
