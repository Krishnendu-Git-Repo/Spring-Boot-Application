package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	private StudentService service;
	
	@PostMapping("/post")
	public StudentEntity addData(@RequestBody StudentEntity entity) {
		return service.addData(entity);
	}
	
	@GetMapping("/get/{stid}")
	public Optional<StudentEntity> findData(@PathVariable Integer stid){
		return service.find(stid);
	}
	
	@PutMapping("/update/{stid}")
	public String update(@RequestBody StudentEntity entity,@PathVariable Integer stid) {
		return service.updateData(entity, stid);
	}
	
	@GetMapping("/getAll")
	public List<StudentEntity> getAllData(@RequestBody StudentEntity entity){
		return service.allData(entity);
	}
	
	@DeleteMapping("/delete/{stid}")
	public String deleteData(@PathVariable Integer stid) {
		return service.delete(stid);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll(@RequestBody StudentEntity entity) {
		return service.deleteAll(entity);
	}
}
