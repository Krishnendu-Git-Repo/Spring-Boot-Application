package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudntService {
	
	@Autowired private StudentRepo studentRepo;

	public String addDatatService(StudentEntity studentEntity) {
		
		studentRepo.save(studentEntity);
		return "Data saved";
	}
}
