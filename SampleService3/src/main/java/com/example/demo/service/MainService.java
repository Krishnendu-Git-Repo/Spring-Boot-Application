package com.example.demo.service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.exception.CustomException;

@Service
public class MainService {
	
	public GlobalResponse addData(JSONObject jsonObject) {
		try {
			RestTemplate restTemplate=new RestTemplate();
			return restTemplate.postForEntity("http://localhost:8090/post", jsonObject, GlobalResponse.class).getBody();
			
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
	}

}
