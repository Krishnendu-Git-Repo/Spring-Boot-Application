package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
	
	
	@RequestMapping("/exam")
	public String example() {
		return "example";
	}

}
