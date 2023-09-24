package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class MainService {

@Autowired
private CustomerRepository customerRepository;

@Autowired
private ProductRepository productRepository;

public Customer addData(Customer customer) {
	return customerRepository.save(customer);
}

public Product addData1(Product product) {
	return productRepository.save(product);
}

public Customer view(Integer id) {
	try {
		return customerRepository.findById(id).get();
	}catch(Exception e) {
		throw new RuntimeException(e.getMessage());
	}
}



}
