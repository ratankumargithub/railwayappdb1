package com.masai;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@SpringBootApplication
public class Demo1Railwayappdb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Railwayappdb1Application.class, args);
	}

	
	@Bean
	public OpenAPI customOpenAPI() {
	    Server server = new Server();
	    server.setUrl("https://testapp/api");
	    return new OpenAPI().servers(List.of(server));
	}
}
