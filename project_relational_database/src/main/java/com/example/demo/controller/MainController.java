package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.MainService;
import java.util.*;
@RestController
public class MainController {
@Autowired private MainService serv;

@PostMapping("/add1")
public ProductEntity add1(@RequestBody ProductEntity prodentity) {
	return serv.add1(prodentity);
}

@PostMapping("/add2")
public String add2(@RequestBody CustomerEntity custentity) {
	return serv.add2(custentity);
}

@GetMapping("/viewAll")
public List<CustomerEntity> str()
{
	return serv.deo();
}

}
