package com.microService.jose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class JoseApplication {

	@GetMapping("/weatherForecast")
	public String getMessage() {
		return "Hoy es un gran dia soleado desde el servicio Java";
	}

	public static void main(String[] args) {
		SpringApplication.run(JoseApplication.class, args);
	}

}
