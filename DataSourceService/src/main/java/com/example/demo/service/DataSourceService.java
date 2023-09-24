package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.CustomException;

@Service
public class DataSourceService {

	@Autowired private StudentRepo repo;
	
	public GlobalResponse postData(StudentEntity entity) {
		try {
			repo.save(entity);
			return new GlobalResponse("Data saved to the database","Success",200);
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}

}
