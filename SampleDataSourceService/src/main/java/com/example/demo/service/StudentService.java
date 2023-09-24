package com.example.demo.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public GlobalResponse postData(JSONObject entity) {
		try {
		  if(entity.get("AccessToken").toString().equals("Test")) {
			  studentRepository.save(new StudentEntity(Integer.parseInt(entity.get("id").toString()),entity.get("name").toString(),entity.get("address").toString()));
			   return new GlobalResponse("Data saved to the database","Success",200);
		  }else
			return new GlobalResponse("Error","Access Denied",400);
		}catch(NullPointerException|ArithmeticException e) {
			return new GlobalResponse("Error","Access Denied",400);
		}
	}

}
