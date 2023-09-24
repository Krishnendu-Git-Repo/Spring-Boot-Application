package com.example.demo.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
 
	public final String UPLOAD_DIR="D:\\PRACTICE\\project_1\\src\\main\\resources\\static\\image";
	
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f=false;
		
		try {
			
			//read the data
			InputStream inputStream = multipartFile.getInputStream();
			
			System.out.println("input Stream is"+ inputStream);
			byte data[]=new byte[inputStream.available()];
			System.out.println("data is"+data);
			inputStream.read(data);
			
			System.out.println(inputStream.read(data));
			
			//write the data
			FileOutputStream fos= new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			f=true;
			System.out.println(fos);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
