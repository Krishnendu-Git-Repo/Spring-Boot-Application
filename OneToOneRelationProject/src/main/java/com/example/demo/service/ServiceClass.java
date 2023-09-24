package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CollegeEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class ServiceClass {
	
	@Autowired
	private StudentRepository studentrepo;
	
	
	@Autowired
	private CollegeRepository collegerepo;
	
	
	public String add1(StudentEntity studentEntity) {
		studentrepo.save(studentEntity);
		return "data added in student table";
	}
	
	
	public String add2(CollegeEntity collegeEntity) {
		collegerepo.save(collegeEntity);
		return "data added in college table";
	}
	
	public StudentEntity view(int id){
		try {
//			CollegeEntity collegeEntity = new CollegeEntity();
			StudentEntity studentEntity = new StudentEntity();
			StudentEntity studentEntity2 = studentrepo.findById(id).get();
			CollegeEntity findByStid = collegerepo.findByStid(studentEntity2.getId()).get(0);
			System.out.println("Find by Stid" + findByStid);
			studentEntity.setAddress(studentEntity2.getAddress());
			studentEntity.setName(studentEntity2.getName());
			studentEntity.setId(studentEntity2.getId());
			studentEntity.setCollegeEntity(findByStid);
			return studentEntity;		
			}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public Optional<StudentEntity> get(int id){
		return studentrepo.findById(id);
	}

}
