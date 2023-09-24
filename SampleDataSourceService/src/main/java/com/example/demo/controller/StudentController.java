package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.exception.CustomException;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addData")
	public GlobalResponse postData(@RequestBody JSONObject entity) {
		try {
			return this.studentService.postData(entity);
			
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}

}
