package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	private Integer bookid;
	private String bookname;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(Integer bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + "]";
	}


	public Integer getBookid() {
		return bookid;
	}


	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
	
	

}
