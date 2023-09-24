package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int productid;
	private String productname;
	private Integer custid;
	
	@ManyToMany
	private List<Customer> customers;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productid, String productname, Integer custid, List<Customer> customers) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.custid = custid;
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", custid=" + custid
				+ ", customers=" + customers + "]";
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
	

	}
