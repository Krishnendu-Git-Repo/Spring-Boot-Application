package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addData")
	public ProductEntity addData(@RequestBody ProductEntity productEntity) {
		return productService.addData(productEntity);
	}
	
	@PutMapping("/updateData/{id}")
	public String updateData(@RequestBody ProductEntity productEntity, @PathVariable Integer id) {
		return productService.updateData(productEntity, id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<ProductEntity> getById(@PathVariable Integer id){
		return productService.getById(id);
	}
	
	@GetMapping("/view")
	public List<ProductEntity> findAllData(@RequestBody ProductEntity productEntity){
		return productService.findAllDAta(productEntity);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable Integer id) {
		return productService.deleteData(id);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll(@RequestBody ProductEntity productEntity) {
		return productService.deleteAll(productEntity);
	}

}
