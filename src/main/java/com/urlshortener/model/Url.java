package com.urlshortener.model;

import static com.urlshortener.util.Constants.CUSTOM_GENERATOR;
import static com.urlshortener.util.Constants.CUSTOM_ID_GENERATOR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Url {

	@Id
	@GeneratedValue(generator = CUSTOM_GENERATOR)
	@GenericGenerator(name = CUSTOM_GENERATOR, strategy = CUSTOM_ID_GENERATOR)
	private String id;

	private String original;

	public Url() {

	}

	public Url(String original) {
		this.original = original;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

}
