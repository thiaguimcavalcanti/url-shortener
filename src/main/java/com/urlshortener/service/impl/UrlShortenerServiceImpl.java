package com.urlshortener.service.impl;

import java.net.URL;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urlshortener.dao.UrlDao;
import com.urlshortener.exceptions.MalformedURLException;
import com.urlshortener.model.Url;
import com.urlshortener.service.UrlShortenerService;
import com.urlshortener.util.Constants;

@Service
public class UrlShortenerServiceImpl implements UrlShortenerService {

	@Autowired
	private UrlDao urlDao;

	@Override
	public Optional<Url> findById(String id) {
		return urlDao.findById(id);
	}

	@Override
	public Url save(String originalUrl) {
		validate(originalUrl);

		Optional<Url> existingUrl = urlDao.findByOriginal(originalUrl);

		return existingUrl.isPresent() ? existingUrl.get() : urlDao.save(new Url(originalUrl));
	}

	private void validate(String stringURL) {
		try {
			new URL(stringURL);
		} catch (java.net.MalformedURLException e) {
			throw new MalformedURLException(String.format(Constants.ERROR_MESSAGE, e.getMessage()));
		}
	}
}
