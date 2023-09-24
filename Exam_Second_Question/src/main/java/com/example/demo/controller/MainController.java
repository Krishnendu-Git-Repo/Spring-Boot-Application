package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;
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

import com.example.demo.entity.Accounting;
import com.example.demo.entity.Sales;
import com.example.demo.service.ServiceDemo;

@RestController
public class MainController {
	
	@Autowired
	private ServiceDemo servie;
	
	@PostMapping("/add")
	public String add(@RequestBody Accounting account) {
		return servie.add(account);
	}
	
	@PostMapping("/add1")
	public String add1(@RequestBody Sales sales) {
		return servie.add1(sales);
	}
	
	@PostMapping("/addAll")
	public String addData(@RequestBody HashMap<String, List<JSONObject>> object) {
		return servie.addData(object);
	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody Accounting accounting, @PathVariable int id) {
		return servie.update(accounting, id);
	}
	
	@PutMapping("/update1/{id}")
	public String update1(@RequestBody Sales sales, @PathVariable Integer id) {
		return servie.update1(sales, id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Accounting> get(@PathVariable int id){
		return servie.get(id);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody List<Integer> id) {
		//System.out.println(id);
		return this.servie.multidelete(id);
	}
	
	@DeleteMapping("/delete2")
	public String deleteMultiple(@RequestBody List<Integer> id) {
		//System.out.println(id);
		return this.servie.deleteMultiple(id);
		
	}
	
//	@GetMapping("/get")
//	public String getMultiData(@RequestBody List<Integer> id) {
//		System.out.println(id);
//		return servie.getMultiData(id);
//	}
	
	@GetMapping("/getApi")
	public Page<Accounting> getAllValues(@RequestParam(value = "pageNumber") Integer pageNumber,
			                             @RequestParam(value ="pageSize") Integer pageSize){
		return servie.getAllValues(pageNumber, pageSize);
		
	}
	
	@GetMapping("/sortedData")
	public Page<Accounting> getAllValues(@RequestParam(value = "pageNumber") Integer pageNumber,
           @RequestParam(value ="pageSize") Integer pageSize,
           @RequestParam(value="sortBy") String sortBy){
           return servie.getAllValues(pageNumber, pageSize, sortBy);

}
	
	@GetMapping("/searchData")
	public Page<Accounting> getSearchValue(@RequestParam Optional<String> keyword){
		return servie.getSearchValue(keyword);
		
	}
	
	@GetMapping("/getAllData")
	public Page<Accounting> getAllValue(@RequestParam(value = "pageNumber") Integer pageNumber,@RequestParam(value ="pageSize") Integer pageSize,
			@RequestParam(value="sortBy") String sortBy,@RequestParam Optional<String> key){
				return servie.getAllValue(pageNumber, pageSize, sortBy, key);
			}
	}
