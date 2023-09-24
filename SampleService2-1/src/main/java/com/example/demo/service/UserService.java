package com.example.demo.service;

import java.util.Optional;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public User addData(User user) {
	 return repo.save(user);
	 
	}
	
	
	public Optional<User> getSampleData(Integer id){
		return repo.findById(id);
	}

}
