package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDetails;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductDetailsRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class MainService {
	@Autowired CustomerRepo custrepo;
	public String add1(Customer customer) {
		custrepo.save(customer);
		return "data added in customer table";
	}
	
	@Autowired OrderRepository orderrepo;
	public String add2(Order order) {
		orderrepo.save(order);
		return "data is added in order table";
	}
	
	@Autowired OrderDetailsRepository orderdetailrepo;
	public String add3(OrderDetails orderdetails) {
		orderdetailrepo.save(orderdetails);
		return "data added in order details table";
	}
	
	@Autowired ProductRepository productrepo;
	public String add4(Product product) {
		productrepo.save(product);
		return "data is added in product table";
	}
	
	@Autowired ProductDetailsRepository productdetailsrepo;
	public String add5(ProductDetails productdetails) {
		productdetailsrepo.save(productdetails);
		return "data is added in product details table";
	}

}
