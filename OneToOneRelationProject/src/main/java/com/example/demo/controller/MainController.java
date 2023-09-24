package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CollegeEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.ServiceClass;

@RestController
public class MainController {
	
	@Autowired
	private ServiceClass service;
	
	@PostMapping("/add1")
	public String add1(@RequestBody StudentEntity studentEntity) {
		return service.add1(studentEntity);
	}
	
	
	@PostMapping("/add2")
	public String add2(@RequestBody CollegeEntity collegeEntity) {
		return service.add2(collegeEntity);
	}
	
	@GetMapping("/view/{id}")
	public StudentEntity view(@PathVariable int id) {
		return service.view(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<StudentEntity>get(@PathVariable int id){
		return service.get(id);
	}

}
