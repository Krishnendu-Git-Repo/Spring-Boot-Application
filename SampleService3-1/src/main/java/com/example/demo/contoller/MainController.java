package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.entity.Book;
import com.example.demo.exception.CustomException;
import com.example.demo.service.ServiceDemo;

@RestController
public class MainController {
	
	@Autowired
	private ServiceDemo serviceDemo;
	
	@PostMapping("/post")
	public GlobalResponse addData(@RequestBody Book book) {
		try {
		return this.serviceDemo.addData(book);
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}
}
