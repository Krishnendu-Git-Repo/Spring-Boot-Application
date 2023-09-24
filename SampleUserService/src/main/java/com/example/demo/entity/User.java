package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	
	private Integer userId;
	private String name;
	private Integer age;
	
	List<Contact> contacts=new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String name, Integer age, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.contacts = contacts;
	}

	public User(Integer userId, String name, Integer age) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	
	
	
	

	
}
