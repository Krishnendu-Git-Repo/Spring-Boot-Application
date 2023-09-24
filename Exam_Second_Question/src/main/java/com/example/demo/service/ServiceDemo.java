package com.example.demo.service;

import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Accounting;
import com.example.demo.entity.Sales;
//import com.example.demo.entity.UserEntity;
//import com.example.demo.entity.Sales;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.SalesRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ServiceDemo {
	
	@Autowired 
	private AccountRepository accrepo;
	
	
	@Autowired 
	private SalesRepository salesrepo;
	
	//add data in account
	public String add(Accounting account) {
		accrepo.save(account);
		return "data added";
	}
	
	//add data in sales
	public String add1(Sales sales) {
		salesrepo.save(sales);
		return "data added";
	}
	
	//add nested data in Accounting
	public String addData(HashMap<String, List<JSONObject>> object) {
		try {
			List<JSONObject> accounting=object.get("accounting");
			List<Accounting> accountingList=new ArrayList<>();
			for(int i=0;i<accounting.size();i++) {
				Accounting accounting2=new Accounting();
				accounting2.setId(Integer.parseInt(accounting.get(i).get("id").toString()));
				accounting2.setAge(Integer.parseInt(accounting.get(i).get("age").toString()));
				accounting2.setFirstName(accounting.get(i).get("firstName").toString());
				accounting2.setLastName(accounting.get(i).get("lastName").toString());
				System.out.println(accounting.get(i));
				Accounting readValue = new ObjectMapper().readValue(accounting.get(i).toString(),Accounting.class );
				System.out.println(readValue);
				accountingList.add(accounting2);
			}
			System.out.println(accountingList);
			accrepo.saveAll(accountingList);
			
			//add nested data in sales 
			List<JSONObject> sales=object.get("sales");
			List<Sales> salesList=new ArrayList<>();
			for(int i=0;i<sales.size();i++) {
				Sales sales2=new Sales();
				sales2.setId(Integer.parseInt(sales.get(i).get("id").toString()));
				sales2.setAge(Integer.parseInt(sales.get(i).get("age").toString()));
				sales2.setFirstName(sales.get(i).get("firstName").toString());
				sales2.setLastName(sales.get(i).get("lastName").toString());
				salesList.add(sales2);
				}
			
			System.out.println(salesList);
			salesrepo.saveAll(salesList);
			
			return null;
			}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	//update in Accounting
	public String update(Accounting accounting, int id) {
		
		try {
			Optional<Accounting> obj=accrepo.findById(id);
			if(!obj.isEmpty()) {
				accrepo.save(accounting);
				return "updated";
			}
			else {
				return "data not exist";
			}
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	//update in Sales
	public String update1(Sales sales, Integer id) {
		try {
			Optional<Sales> obj1=salesrepo.findById(id);
			if(!obj1.isEmpty()) {
				salesrepo.save(sales);
				return "updated";
			}
			else {
				return "data does not exist";
			}
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	//findById in Accounting
	public Optional<Accounting> get(int id){
		return accrepo.findById(id);
		
	}
	
	//deleted List of id from Accounting
	public String multidelete(List<Integer> id) {
		List<Accounting> accountDetails=accrepo.findByIdIn(id);
		System.out.println(accountDetails);
		for(Accounting accounting:accountDetails) {
			accrepo.delete(accounting);
		}
		return "deleted";
		}
	
	//deleting List of id from Sales 
	public String deleteMultiple(List<Integer> id) {
		List<Sales> salesDetails=salesrepo.findByIdIn(id);
		System.out.println(salesDetails);
		for(Sales sales:salesDetails) {
			salesrepo.delete(sales);
		}
		//salesrepo.deleteAll(salesDetails);
		return "deleted";
	}
	
	
	//paging in Accounting
	public Page<Accounting> getAllValues(int pageNumber,int pageSize){
		 
		  Pageable pageable=PageRequest.of(pageNumber, pageSize);
		  Page<Accounting> pageAccount=this.accrepo.findAll(pageable);
		  return pageAccount;
	  }

	
	//sorting and paging in Accounting
	public Page<Accounting> getAllValues(Integer pageNumber, Integer pageSize, String sortBy) {
		Pageable pageable=PageRequest.of(pageNumber, pageSize, Sort.by(sortBy).descending());
		Page<Accounting> page=this.accrepo.findAll(pageable);
		return page;
	}
	
	//searching and paging in Accounting
	public Page<Accounting> getSearchValue(Optional<String> keyword){
		System.out.println(keyword.get());
		System.out.println(keyword);
		Pageable pageable=PageRequest.of(0, 3);
		 Page<Accounting> findAll = accrepo.findAlls(keyword.get(),pageable);
		 return findAll;
	}
	//paging, searching and sorting in Accounting
	public Page<Accounting> getAllValue(Integer pageNumber, Integer pageSize, String sortBy,Optional<String> key){
		Pageable pageable=PageRequest.of(pageNumber, pageSize, Sort.by(sortBy).ascending());
		Page<Accounting> pageDetails=accrepo.findAllValue(key.get(),pageable);
		return pageDetails;
	}
	
}
