package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition( 
	    servers = {
	       @Server(url = "/", description = "Default Server URL")
	    }
	) 
@SpringBootApplication
public class Demo1Railwayappdb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Railwayappdb1Application.class, args);
	}

	
}
