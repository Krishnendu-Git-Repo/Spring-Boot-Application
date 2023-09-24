package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public Book addData(Book book) {
		return bookRepo.save(book);
	}
	
	
	public Optional<Book> getSampleData(Integer bookid){
		return bookRepo.findById(bookid);
	}
}
