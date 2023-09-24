package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired private UserRepo userRepo;
	
	

	public String addDatatService(UserEntity userEntity) {
		
		userRepo.save(userEntity);
		return "Data saved";
	}
		public Optional<UserEntity> get(int userid){
			return userRepo.findById(userid);
		}
		
		
	
}
