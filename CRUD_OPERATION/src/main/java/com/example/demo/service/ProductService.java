package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	//Addition
	public ProductEntity addData(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}
	
	//Update
	public String updateData(ProductEntity productEntity, Integer id) {
		try {
			Optional<ProductEntity> entity=productRepository.findById(id);
			if(!entity.isEmpty()) {
				productRepository.save(productEntity);
				return "updated";
			                      }
			else
			{
				return "id doesn't exist";
			}
		    }catch(Exception e) {
				return e.getMessage();
			}
		
	}
	
	//findById
	public Optional<ProductEntity> getById(Integer id){
		return productRepository.findById(id);
	}
	
	//findAll
	public List<ProductEntity> findAllDAta(ProductEntity productEntity) {
		return productRepository.findAll();
	}
	
	//delete
	public String deleteData(Integer id) {
		productRepository.deleteById(id);
		return "deleted";
	}
	
	//deleteAll
	public String deleteAll(ProductEntity productEntity) {
		productRepository.deleteAll();
		return "All deleted";
	}
	
	

		}
