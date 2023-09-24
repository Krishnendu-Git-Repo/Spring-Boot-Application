package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demoService.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	@PostMapping("/add")
	public String add(Customer customer) {
		return mainService.add(customer);
		
	}
}
