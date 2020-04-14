package com.pdomingo.shipping.configuration.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class ClientModule extends SimpleModule {

	public ClientModule() {
		addSerializer(new DelegatedIdentifierSerializer());
	}
}
