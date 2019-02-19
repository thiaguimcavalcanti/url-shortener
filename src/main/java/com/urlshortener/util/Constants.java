package com.urlshortener.util;

public class Constants {

	private Constants() {

	}

	public static final String SAVE_RETURN = "{\"id\": \"%s\"}";

	public static final String GET_BY_ID_RETURN = "{\"url\": \"%s\"}";

	public static final String ERROR_MESSAGE = "{\"message\": \"%s\"}";

	public static final String CUSTOM_GENERATOR = "custom-generator";

	public static final String CUSTOM_ID_GENERATOR = "com.urlshortener.generator.CustomIdGenerator";
}
