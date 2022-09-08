package com.scientit.drogaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DrogariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrogariaApplication.class, args);
	}

	@RequestMapping("/")
	String Home() {
		return "Seja bem-vindo a Drogaria Api";
	}

}
