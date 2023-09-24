package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.User;
import com.example.demo.service.UserInterface;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserInterface userInterface;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {
		
		
		User user = this.userInterface.getUser(userId);
		
		List contacts = this.restTemplate.getForObject("http://localhost:8091/contact/user/" + user.getUserId(), List.class);
		
		user.setContacts(contacts);
		return  user;
		
	}

}
