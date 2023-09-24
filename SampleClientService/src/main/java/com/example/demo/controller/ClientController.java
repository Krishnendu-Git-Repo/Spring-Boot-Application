package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.exception.CustomException;
import com.example.demo.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	
	@PostMapping("/send")
	public GlobalResponse sendData(@RequestBody JSONObject jsonObject) {
		try {
			return this.clientService.sentData(jsonObject);
		}catch(NullPointerException e) {
			throw new CustomException(e.getMessage());
		}
	}

}
