package com.org.database.crud.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
	private final Map<String, String> serviceMappings;

	public SampleController(Map<String, String> serviceMappings)
	{
		this.serviceMappings = serviceMappings;
	}

	@GetMapping("/sampleValue/{key}")
	public String generate(@PathVariable String key)
	{
		return serviceMappings.entrySet().stream()
				.filter(entry -> entry.getKey().equals(key))
				.map(Map.Entry::getValue)
				.findFirst()
				.orElse(null);
	}

}
