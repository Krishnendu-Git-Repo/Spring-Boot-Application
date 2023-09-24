 package com.example.demo.service;

//import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//import com.example.demo.entity.Accounting;
import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;

//import java.net.http.HttpResponse;
import java.util.*;

@Service
public class UserService {
  @Autowired private UserRepository repo;
  
  public String addData(UserEntity entity) {
	  repo.save(entity);
	  return "data is added";
  }
  
  public Optional<UserEntity> getData(int id){
	  return repo.findById(id);
  }
  
  public String deleteData(int id) {
	  repo.deleteById(id);
	  return "data is deleted";  
	  }
  
  public String updateData(UserEntity entity,int id) {
	  try {
	  Optional<UserEntity> ob=repo.findById(id);
	  if(!ob.isEmpty()) {
		  repo.save(entity);
	      return "Updated";
	  }
	  else {
		  return "No data is found";
	  }}
	  catch(Exception e) {
		  return e.getMessage();	 
		 }
  }
  
  public List<UserEntity> getAllValues(){
	  List<UserEntity> obj=new ArrayList<UserEntity>();
	  repo.findAll().forEach(e->obj.add(e));
	  return obj;
  }
  
  public Page<UserEntity> getAllValues(int pageNumber,int pageSize,String sortBy){
		 
		//List<Accounting> object=new ArrayList<Accounting>();
		  Pageable pageable=PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
	  //Pageable pageable=PageRequest.of(pageNumber, pageSize);
		  Page<UserEntity> pageAccount=this.repo.findAll(pageable);
		  return pageAccount;
  }
  
  
//  public Optional<?> getData(){
//	  System.out.println("printing...");
//		HttpResponse<String> response =Unirest.get("http://localhost:8090/get/17").asString();
//	
//		return Optional.of(response.getBody().toString());
//	}
//  }
  
}