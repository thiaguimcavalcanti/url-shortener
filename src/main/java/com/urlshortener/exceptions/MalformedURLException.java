package com.urlshortener.exceptions;

public class MalformedURLException extends RuntimeException {

	private static final long serialVersionUID = -3496214556711732662L;

	public MalformedURLException() {

	}

	public MalformedURLException(String message) {
		super(message);
	}
}
