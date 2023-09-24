package com.crud.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.demo.entity.StudentProfile;

@Repository
public interface StudentRepo extends MongoRepository<StudentProfile, Integer> {
	@Query("{'age' : ?0}")
	public List<StudentProfile> findByAge(Integer age);
}
