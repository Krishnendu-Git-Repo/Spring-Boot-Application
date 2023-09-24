package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.entity.Book;
import com.example.demo.exception.CustomException;
import com.example.demo.repository.BookRepo;

@Service
public class ServiceDemo {
	
	@Autowired
	private BookRepo bookRepo;
	
	public GlobalResponse addData(Book book) {
		try {
		this.bookRepo.save(book);
		return new GlobalResponse("data added in database","success",100);
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}

}
