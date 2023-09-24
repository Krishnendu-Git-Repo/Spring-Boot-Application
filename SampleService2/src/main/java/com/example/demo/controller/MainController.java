package com.example.demo.controller;

import org.springframework.http.HttpHeaders;

//import java.net.http.HttpHeaders;

//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	HttpHeaders httpHeaders=new HttpHeaders();
	
	@GetMapping("/slaveServerRes")
	public String slaveServerResponse() {
		try {
			RestTemplate restTemplate=new RestTemplate();
			
			return restTemplate.getForEntity("http://localhost:8090/masterServerRes", String.class).getBody();
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}
