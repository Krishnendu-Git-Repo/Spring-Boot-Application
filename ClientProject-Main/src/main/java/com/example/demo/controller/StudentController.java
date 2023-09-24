package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;

@RestController
@RequestMapping("/updatePostData")
public class StudentController {
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> updateRecord(HttpServletRequest httpServletRequest, @RequestBody StudentEntity studentEntity){
		try {
			System.out.println("Id: "+studentEntity.getId()+"NAME: "+studentEntity.getName()+"ADDRESS: "+studentEntity.getAddress());
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
		return ResponseEntity.ok(null);
		
	}

}
