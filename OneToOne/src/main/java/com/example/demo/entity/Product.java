package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int productid;
	private String productname;
	private Integer id;
	@OneToOne(mappedBy = "product")
	private Customer customer;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productid, String productname, Integer id, Customer customer) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.id = id;
		this.customer = customer;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	

}
