package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
	@GetMapping("/main")
    public int main()
    {
    	System.out.println("Hello World!");
    	return 10;
    }
}
