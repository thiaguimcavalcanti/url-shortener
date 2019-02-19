package com.urlshortener;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class ServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
