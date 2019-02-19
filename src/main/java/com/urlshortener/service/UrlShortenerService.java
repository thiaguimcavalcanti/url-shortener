package com.urlshortener.service;

import java.util.Optional;

import com.urlshortener.model.Url;

public interface UrlShortenerService {

	Optional<Url> findById(String id);

	Url save(String original);

}
