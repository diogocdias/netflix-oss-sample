package com.example.servicea;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;			

@Service
public class ServiceAService {

	  private final RestTemplate restTemplate;

	  public ServiceAService(RestTemplate rest) {
	    this.restTemplate = rest;
	  }

	  @HystrixCommand(commandKey = "serviceARead", fallbackMethod = "readFallback")
	  public String read() {
	    URI uri = URI.create("http://localhost:8091/read");

	    return this.restTemplate.getForObject(uri, String.class);
	  }

	  public String readFallback() {
	    return "ServiceA Fallback method";
	  }


}