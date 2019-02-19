package com.urlshortener.generator;

import java.io.Serializable;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	private static final int QTY_CHARACTERES = 6;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		return RandomStringUtils.randomAlphanumeric(QTY_CHARACTERES);
	}

}