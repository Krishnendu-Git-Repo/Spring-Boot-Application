package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.MainRepo;

@Service
public class MainService {
	
	@Autowired
	private MainRepo mainRepo;
	
	public String add(Customer customer) {
		mainRepo.save(customer);
		return "data added";
	}
	
	public Customer view(int id) {
		try {
			return mainRepo.findById(id).get();
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
