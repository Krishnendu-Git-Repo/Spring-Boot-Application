package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.MainService;

@RestController
public class MainController {
	@Autowired private MainService service;
	
	@PostMapping("/add1")
	public String add1(@RequestBody Customer customer) {
		 return service.add1(customer);
	}
	
	@GetMapping("/view/{id}")
	public Optional<Customer> view(@PathVariable int id) {
		return service.view(id);
	}

}
