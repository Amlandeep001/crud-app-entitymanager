package com.org.database.crud.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class ServiceConfigurationProperties
{
	@Bean
	@ConfigurationProperties(prefix = "service.mappings")
	Map<String, String> serviceMappings()
	{
		return new HashMap<>();
	}
}
