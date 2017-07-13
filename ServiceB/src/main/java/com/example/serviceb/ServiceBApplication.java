package com.example.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBApplication {

	
	@RequestMapping(value = "/read")
	public String read() {
		return "Service B working";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}
}
