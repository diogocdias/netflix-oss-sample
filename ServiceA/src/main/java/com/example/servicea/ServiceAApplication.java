package com.example.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.servicea.ServiceAService;			

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class ServiceAApplication {

	  @Autowired
	  private ServiceAService serviceAService;

	  @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	    return builder.build();
	  }
	  
	  @RequestMapping("/request")
	  public String request() {
	    return serviceAService.read();
	  }

	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}