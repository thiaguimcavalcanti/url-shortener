package com.urlshortener.controller;

import static com.urlshortener.util.Constants.GET_BY_ID_RETURN;
import static com.urlshortener.util.Constants.SAVE_RETURN;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urlshortener.model.Url;
import com.urlshortener.service.UrlShortenerService;

@RestController
public class UrlShortenerController {

	@Autowired
	private UrlShortenerService urlShortenerService;

	/**
	 * Save URL Shortener
	 * 
	 * @param originalUrl
	 * @return The generated id
	 */
	@PostMapping(path = "/save")
	public ResponseEntity<String> saveUrl(String originalUrl) {
		Url url = urlShortenerService.save(originalUrl);

		return ResponseEntity.ok(String.format(SAVE_RETURN, url.getId()));
	}

	/**
	 * Get URL by id
	 * 
	 * @param id
	 * @return The URL stored
	 */
	@GetMapping(path = "/getById")
	public ResponseEntity<String> getById(String id) {
		Optional<Url> url = urlShortenerService.findById(id);

		if (url.isPresent()) {
			return ResponseEntity.ok(String.format(GET_BY_ID_RETURN, url.get().getOriginal()));
		}

		return ResponseEntity.notFound().build();
	}
}
