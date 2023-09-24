package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private StudntService studntService;

	@GetMapping("/test")
	public String main() {
		return "ok";
	}
	@PostMapping("/add")
	public String addData(@RequestBody StudentEntity studentEntity) {
		return this.studntService.addDatatService(studentEntity);
	}
}
