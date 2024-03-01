package com.tony.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tony.bookstore.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String Strategy;
	
	@Bean
	public boolean instanciaBaseDados() {
		
		if(Strategy.equals("create")) {
			 this.dbService.instanciaBaseDados();
		}
		return false;
		
		
	}
}
