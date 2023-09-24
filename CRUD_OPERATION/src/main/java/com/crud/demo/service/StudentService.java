package com.crud.demo.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.crud.demo.entity.StudentProfile;

public interface StudentService {
	public ResponseEntity<?> addStudent(StudentProfile studentProfile) ;
	public ResponseEntity<?> getStudent(Integer stId);
	public ResponseEntity<?> updateStudent(Integer id, StudentProfile studentProfile);
	public Map<String, Object> getByAge(Integer age);
	public ResponseEntity<?> deleteStudent(Integer stId);
}
