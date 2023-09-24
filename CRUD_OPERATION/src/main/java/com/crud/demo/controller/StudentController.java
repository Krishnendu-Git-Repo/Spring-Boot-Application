package com.crud.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.entity.StudentProfile;
import com.crud.demo.exception.CustomException;
import com.crud.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody StudentProfile studentProfile) {
	try {
		return this.studentService.addStudent(studentProfile);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	
	@GetMapping("/getStudent/{stId}")
	public ResponseEntity<?> getStudent(@PathVariable Integer stId) {
	try {
		return this.studentService.getStudent(stId);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable Integer id, @RequestBody StudentProfile studentProfile) {
	try {
		return this.studentService.updateStudent(id, studentProfile);
	}catch (Exception e) {
		throw new CustomException(e.getMessage());
	}
	}
	
	@GetMapping("/getByAge")
	public Map<String, Object> getByAge(@RequestParam Integer age) {
		try {
			return this.studentService.getByAge(age);
		}catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
		try {
			return this.studentService.deleteStudent(id);
		}catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
	}
}
