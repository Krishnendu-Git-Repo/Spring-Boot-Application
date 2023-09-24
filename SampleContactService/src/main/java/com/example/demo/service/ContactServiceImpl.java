package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list=Arrays.asList(
			new Contact(1,"amit@gmail.com","amit",10),
			new Contact(2,"amal@gmail.com","amal",10),
			new Contact(3,"anil@gmail.com","anil",11),
			new Contact(4,"sami@gmail.com","sami",13)
			
			);
	
	
	
	
	@Override
	public List<Contact> getContactsOfUser(Integer userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	
	
}
