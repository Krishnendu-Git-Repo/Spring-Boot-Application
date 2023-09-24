package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceMainController {
	
	
	@GetMapping("/get")
	public String get() {
		try {
		return "Hello World!";
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
