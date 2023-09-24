package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class MainService {
	
	@Autowired ProductRepository prodrepo;
	@Autowired CustomerRepository custrepo;
	
	public ProductEntity add1(ProductEntity prodentity) {
		return prodrepo.save(prodentity);
	}
	public String add2(CustomerEntity custentity) {
		custrepo.save(custentity);
		return "data added done";
	}
public List<CustomerEntity> deo()
{
	return custrepo.findAll();
}
}
