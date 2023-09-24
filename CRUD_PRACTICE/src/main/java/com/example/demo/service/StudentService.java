package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository repository;
	
	public StudentEntity addData(StudentEntity entity) {
		return repository.save(entity);
	}
	
	
	public Optional<StudentEntity> find(Integer stid){
		return repository.findById(stid);
	}
	
	
	public String updateData(StudentEntity entity, Integer stid) {
		try {
			
			Optional<StudentEntity> data=repository.findById(stid);
			if(!data.isEmpty()) {
				repository.save(entity);
				return "updated";
			}else {
				return "id does not exist";
			}
			
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public List<StudentEntity> allData(StudentEntity entity){
		return repository.findAll();
	}
	
	public String delete(Integer stid) {
		repository.deleteById(stid);
		return "deleted";
	}
	
	public String deleteAll(StudentEntity entity) {
		repository.deleteAll();
		return "All Deleted";
	}

}
