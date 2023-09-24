package com.example.demo.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.GlobalResponse.GlobalResponse;
import com.example.demo.exception.CustomException;

@Service
public class ClientService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ClientService.class);
	
	public GlobalResponse sentData(JSONObject jsonObject) {
		try {
			
			//String password="Test";
			jsonObject.put("AccessToken", "Test");
			
			String encryptedpassword = null;  
			try {
				MessageDigest message = MessageDigest.getInstance("MD5");
				message.update("Test".getBytes());
				 byte[] bytes = message.digest(); 
				 LOGGER.info(bytes.toString());
				 StringBuilder str = new StringBuilder();  
		            for(int i=0; i< bytes.length ;i++)  
		            {  
		            	LOGGER.info(bytes[i] + "");
		                str.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
		                LOGGER.info(Integer.toString((bytes[i] & 0xff) + 0x100, 16));
		            } 
		            
		            encryptedpassword = str.toString();
			} catch (NoSuchAlgorithmException e)   
	        {  
	            e.printStackTrace();  
	        }
			LOGGER.info(encryptedpassword.toString());
			
			
			
			
			//byte encript[] = "Test".getBytes("UTF8");  
			//LOGGER.info(encript.toString()); 
			
			
			
			LOGGER.info(jsonObject.toJSONString());
		    RestTemplate restTemplate=new RestTemplate();
		    return restTemplate.postForEntity("http://localhost:8090/addData", jsonObject, GlobalResponse.class).getBody();
		
		    //return restTemplate.postForEntity("http://localhost:8090/addData", jsonObject, GlobalResponse.class).getBody();
		
		
		}catch(Exception e) {
			throw new CustomException(e.getMessage());
		}
		
	}

}
