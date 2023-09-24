package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	private int id;
	private String productname;
	private Integer custid;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String productname, Integer custid) {
		super();
		this.id = id;
		this.productname = productname;
		this.custid = custid;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", custid=" + custid + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	
	
	
	
	
	

}
