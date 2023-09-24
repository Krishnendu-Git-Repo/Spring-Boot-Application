package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ThirdPartyController {
	
	
	@GetMapping("/view")
	public String view() {
		try {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate.getForEntity("http://localhost:8090/get", String.class).getBody();
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}

}
