package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import java.util.*;

@RestController
public class MainController {
  @Autowired public UserService service;
  
  @PostMapping("/add")
  public String add(@RequestBody UserEntity a) {
	  return service.addData(a);
  }
  
  @GetMapping("/get/{id}")
  public Optional<UserEntity> get(@PathVariable int id){
	 return service.getData(id); 
	 }
  
  @DeleteMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
	  return service.deleteData(id);
  }
  
  @PutMapping("/update/{id}")
  public String update(@RequestBody UserEntity b,@PathVariable int id) {
	  return service.updateData(b, id);
  }
  @GetMapping("/read")
  public List<UserEntity> getAll(){
	  return service.getAllValues();
  }
  
  @GetMapping("/sortData")
	public Page<UserEntity> getAllValues(@RequestParam(value = "pageNumber",defaultValue = "0") Integer pageNumber,
			                             @RequestParam(value ="pageSize",defaultValue = "3") Integer pageSize,
			                             @RequestParam(value ="sortBy",defaultValue = "name") String sortBy){
		return service.getAllValues(pageNumber, pageSize, sortBy);
		
	}
}
