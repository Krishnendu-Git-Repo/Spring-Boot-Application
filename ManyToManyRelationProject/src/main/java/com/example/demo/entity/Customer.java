package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int id;
	private String custname;
	private String custaddress;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName = "custid")
	private List<Product> products;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String custname, String custaddress, List<Product> products) {
		super();
		this.id = id;
		this.custname = custname;
		this.custaddress = custaddress;
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custname=" + custname + ", custaddress=" + custaddress + ", products="
				+ products + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
