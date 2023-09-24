package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDetails;
import com.example.demo.service.MainService;

@RestController
public class MainController {
	@Autowired MainService mainservice;
	
	@PostMapping("/add1")
	public String add1(@RequestBody Customer customer) {
		return mainservice.add1(customer);
	}
	
	@PostMapping("/add2")
	public String add2(@RequestBody Order order) {
		return mainservice.add2(order);
	}
	
	@PostMapping("/add3")
	public String add3(@RequestBody OrderDetails orderdetail) {
		return mainservice.add3(orderdetail);
	}
	
	@PostMapping("/add4")
	public String add4(@RequestBody Product product) {
		return mainservice.add4(product);
	}
	
	@PostMapping("/add5")
	public String add5(@RequestBody ProductDetails productdetails) {
		return mainservice.add5(productdetails);
	}

}
