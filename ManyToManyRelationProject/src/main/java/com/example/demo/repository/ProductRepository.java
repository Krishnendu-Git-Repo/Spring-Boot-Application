package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByCustid(int id);

	

}
