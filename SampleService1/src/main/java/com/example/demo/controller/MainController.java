package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/masterServerRes")
	public String masterServerResponse() {
		try {
			return "RestCall done";
			
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
