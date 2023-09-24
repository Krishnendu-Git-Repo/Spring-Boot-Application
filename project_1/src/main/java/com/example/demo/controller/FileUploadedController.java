package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.helper.FileUploadHelper;

@RestController
public class FileUploadedController {
	
	@Autowired
	private FileUploadHelper fileUploadHelper;

    @PostMapping("/uploadFile")
	public ResponseEntity<String> uploadFile(@RequestParam("image") MultipartFile file){
    	
    	try {
//    	System.out.println(file.getOriginalFilename());
//    	System.out.println(file.getContentType());
//    	System.out.println(file.getSize());
//    	System.out.println(file.getName());
    	
    	
    	//validation
    	if(file.isEmpty()) {
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
    	}
    	if(!file.getContentType().equals("image/jpeg")) {
    	  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg format data are allowed");	
    	}
    	
    	//file upload code....
    	boolean f=fileUploadHelper.uploadFile(file);
    	System.out.println(f);
    	if(f) {
    		return ResponseEntity.ok("File is successfully uploaded");
    	}
    	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
	}
}
