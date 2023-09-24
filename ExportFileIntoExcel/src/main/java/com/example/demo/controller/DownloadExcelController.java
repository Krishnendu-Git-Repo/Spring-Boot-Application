package com.example.demo.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.exporter.ExcelFileExporter;
import com.example.demo.model.Customer;

@Controller
public class DownloadExcelController {

	@RequestMapping
	public String index() {
		return "index";
	}

	@GetMapping("/download/customer.xlsx")
	public void downloadExcelFile(HttpServletResponse response) throws IOException {

		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=customers.xlsx");

		ByteArrayInputStream inputStream = ExcelFileExporter.exportCustomerListToExcelFile(createTestData());

		IOUtils.copy(inputStream, response.getOutputStream());

	}

	private List<Customer> createTestData() {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Riju", "Samanta", "Ramnarayanpur"));
		customers.add(new Customer("Krish", "Samanta", "Tarakeswar"));
		customers.add(new Customer("Rahul", "Sharma", "Kolkata"));
		customers.add(new Customer("Rakseh", "Manna", "Dumdum"));

		return customers;

	}

}
