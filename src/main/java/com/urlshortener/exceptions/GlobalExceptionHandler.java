package com.urlshortener.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Handle the {@link MalformedURLException}
	 * 
	 * @param ex
	 * @param request
	 * @return {@link ResponseEntity} with status code 400
	 */
	@ExceptionHandler(MalformedURLException.class)
	public ResponseEntity<Object> appExceptionHandler(MalformedURLException ex, WebRequest request) {
		return handleExceptionInternal(ex, ex.getMessage(), null, BAD_REQUEST, request);
	}
}