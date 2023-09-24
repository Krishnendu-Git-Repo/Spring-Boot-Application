package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.service.MainService;


@RestController
public class MainController {
	
	@Autowired
	private MainService service;
	
	@PostMapping("/dataAdd")
	public GlobalResponse addData(@RequestBody JSONObject jsonObject) {
		try {
            return this.service.addData(jsonObject);
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
