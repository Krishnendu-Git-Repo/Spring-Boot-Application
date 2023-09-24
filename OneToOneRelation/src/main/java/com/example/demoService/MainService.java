package com.example.demoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class MainService {
   
	@Autowired
	private CustomerRepository customerRepository;
	
	public String add(Customer customer) {
		customerRepository.save(customer);
		return "data is added";
	}
}
