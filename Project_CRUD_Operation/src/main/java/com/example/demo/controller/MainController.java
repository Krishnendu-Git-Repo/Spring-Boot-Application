package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired 
	private UserService userService;
	
	
	@GetMapping("/get/{userid}")
	public Optional<UserEntity> getdata(@PathVariable int userid){
		return userService.get(userid);
	}
	@PostMapping("/add")
	public String addData(@RequestBody UserEntity userEntity) {
		return this.userService.addDatatService(userEntity);
	}

}
