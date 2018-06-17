package com.camix.example.springaws.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.amazonaws.jmespath.ObjectMapperSingleton;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootConfiguration
public class SpringbootAwsExampleConfiguration {

	@Bean("objectMapper")
	@Primary
	public ObjectMapper getObjectMapper() {
		return ObjectMapperSingleton.getObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
	}
}
