package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@PostMapping("/addCustomer")
	public Customer addData(@RequestBody Customer customer) {
		return mainService.addData(customer);
	}
	
	@PostMapping("/addProduct")
	public Product addaData(@RequestBody Product product) {
		return mainService.addData1(product);
	}
	
	@GetMapping("/view/{id}")
	public Customer view(@PathVariable Integer id) {
		return mainService.view(id);
	}

}
