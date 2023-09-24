package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@PostMapping("/add1")
	public Customer add1(@RequestBody Customer customer) {
		return mainService.add1(customer);
		
	}
	
	@PostMapping("/add2")
	public Product add(@RequestBody Product product) {
		return mainService.add2(product);
	}
	
//	@RequestMapping("/getAll")
//	public ResponseEntity<Object> getAllUsers(){
//		return mainService.getAllUsers();
//	}
	
	@RequestMapping("/view")
	public Customer view(@PathVariable int id) {
		return mainService.view(id);
		}

}
