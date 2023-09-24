package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.StudentRepository;
import java.util.*;

@Service
public class StudentService 
{
	@Autowired private StudentRepository strepo;
	
	public String addStudent(StudentEntity stentity) {
		strepo.save(stentity);
		return "data is saved";
	}
	
    public Optional<StudentEntity> get(int studentid){
    	return strepo.findById(studentid);
    }
    public String deleteData(int studentid) {
   	 strepo.deleteById(studentid);
   	 return "data is deleted";
   }
   public void updateData(StudentEntity stentity,int studentid) {
	   strepo.save(stentity);
    }
   
//   public void dataupdate(StudentEntity entity,Integer id) {
//	   StudentEntity entity2 = strepo.findById(id).get();
//     strepo.save(entity2);
//	  
//   }
}