package com.tony.bookstore.config;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tony.bookstore.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	DBService dbService;
	
	@Bean
	public DBService instanciaBaseDados() {
		
		dbService.instanciaBaseDados();
		return dbService;
		
		
	}
}
