package com.example.demo.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//import com.example.demo.entity.CollegeEntity;
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
	
	
	public Customer add1(Customer customer) {
		return customerRepository.save(customer);
		}
	
	public Product add2(Product product) {
		return productRepository.save(product);
	}
	
//	public ResponseEntity<Object> getAllUsers() {
//        List<Customer> cust = customerRepository.findAll();
//        if (cust.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(cust, HttpStatus.OK);
//    }
	
	public Customer view(int id) {
		try {
			Customer customer=new Customer();
			Customer customer2= customerRepository.findById(id).get();
			Product findByCustid = productRepository.findByCustid(customer2.getId()).get(0);
			System.out.println("findByCustid"+findByCustid);
			
			customer.setId(customer2.getId());
			customer.setCustname(customer2.getCustname());
			customer.setCustaddress(customer2.getCustaddress());
			customer.setProducts(customer2.getProducts());
			return customer;
			}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
}



