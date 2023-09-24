package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;


@Service
public class UserServiceImpl implements UserInterface {

	List<User> list=Arrays.asList(
			new User(10,"Krish",25),
			new User(11,"Krishendu",26),
			new User(13,"Riju",24)
			);
	
	
	
	
	
	@Override
	public User getUser(Integer id) { 
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	
	

}
