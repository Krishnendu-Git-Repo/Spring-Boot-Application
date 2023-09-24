package com.example.demo.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {

	List<Sales> findByIdIn(List<Integer> id);

	
	

}


