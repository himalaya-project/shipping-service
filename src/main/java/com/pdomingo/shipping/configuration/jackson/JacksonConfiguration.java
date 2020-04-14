package com.pdomingo.shipping.configuration.jackson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.Module;

@Configuration
public class JacksonConfiguration {

	@Bean
	Module clientModule() {
		return new ClientModule();
	}
}
