package com.urlshortener.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urlshortener.model.Url;

@Repository
public interface UrlDao extends JpaRepository<Url, String> {

	Optional<Url> findByOriginal(String original);
}
