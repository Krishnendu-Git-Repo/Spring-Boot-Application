package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@RestController
public class MainController {
	@Value("${value.data}")
	private String data;
	
@Autowired StudentService stserv;

@Autowired StudentRepository repo;

@PostMapping("/add")
public String addData(@RequestBody StudentEntity stentity) {
	
	return this.stserv.addStudent(stentity);
}
@GetMapping("/get/{studentid}")
public Optional<StudentEntity> getData(@PathVariable int studentid){
	
	return stserv.get(studentid);
}
@PutMapping("/update/{studentid}")
public String update(@RequestBody StudentEntity stentity,@PathVariable int studentid) {
	try {
		Optional<StudentEntity> id = repo.findById(studentid);
		if(!id.isEmpty()) {
			repo.save(stentity);
			return "updated";
		} 
		else {
			return "Id does not exist";
		}
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}

//@PutMapping("/data/{id}")
//public String updatebyid(@PathVariable int id,@RequestBody StudentEntity entity) {
//	
//	stserv.dataupdate(entity, id);
//	
//	return "Updated";
//	
//}
@PostMapping("/get")
public String sample() {
	
	System.out.println(data);
	return "ok";
}

}





