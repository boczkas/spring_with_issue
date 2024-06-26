package com.example.lekcja3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application {

//	http://localhost:8080/swagger-ui/index.html

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
