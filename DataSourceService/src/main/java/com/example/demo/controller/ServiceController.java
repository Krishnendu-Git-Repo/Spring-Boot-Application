package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.CustomException;
import com.example.demo.service.DataSourceService;

@RestController
public class ServiceController {
	
	@Autowired private DataSourceService dataSourceService;
	
	@PostMapping("/addData")
	public GlobalResponse addData(@RequestBody StudentEntity entity) {
		try {
			return this.dataSourceService.postData(entity);
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}

}
