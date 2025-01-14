package com.org.database.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.org.database.crud.repository.base.InsertUpdateRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = InsertUpdateRepositoryImpl.class)
public class CrudApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(CrudApplication.class, args);
	}
}
