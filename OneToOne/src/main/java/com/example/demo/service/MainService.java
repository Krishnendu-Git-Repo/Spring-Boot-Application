package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class MainService {
  
	@Autowired private CustomerRepository custrepo;
	

	public String add1(Customer customer) {
	  custrepo.save(customer);
	  return "data is added in customer table";
	}
	
	public Optional<Customer> view(int id) {
		try {
			return custrepo.findById(id);
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
