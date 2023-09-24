package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private int addresscode;
	private String name;
	private Integer custid;
	
	@OneToOne(mappedBy = "address")
	private Customer customer;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addresscode, String name, Integer custid, Customer customer) {
		super();
		this.addresscode = addresscode;
		this.name = name;
		this.custid = custid;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [addresscode=" + addresscode + ", name=" + name + ", custid=" + custid + ", customer="
				+ customer + "]";
	}

	public int getAddresscode() {
		return addresscode;
	}

	public void setAddresscode(int addresscode) {
		this.addresscode = addresscode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
}
