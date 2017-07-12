package com.example.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;			

@RestController
@SpringBootApplication
public class ServiceAApplication {

	@RequestMapping(value = "/request")
	public String request() {
		return "ServiceA working";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}