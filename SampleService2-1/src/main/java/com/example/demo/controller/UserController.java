package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/add")
	public User addData(@RequestBody User user) {
		return service.addData(user);
	}
		
	@GetMapping("/get")
	public String get() {
		return "Hello";
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<User> getSampleData(@PathVariable Integer id){
		return service.getSampleData(id);
	}
		
		
	

}
