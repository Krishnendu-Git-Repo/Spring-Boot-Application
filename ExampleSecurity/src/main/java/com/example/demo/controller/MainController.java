package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
public class MainController {
	
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/post")
	public Book addData(@RequestBody Book book) {
		return bookService.addData(book);
	}
	
	@GetMapping("/get/{bookid}")
	public Optional<Book> getSampleDat(@PathVariable Integer bookid){
		return bookService.getSampleData(bookid);
	}
	
	@GetMapping("/")
	public String hello() {
		return "HELLO";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "admin";
	}
	
	

}
