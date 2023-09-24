package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="address")
public class Address {
	
	@Id
	private int addresscode;
    private String addressname;
    private int custid;
	
    public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public Address(int addresscode, String addressname, int custid) {
		super();
		this.addresscode = addresscode;
		this.addressname = addressname;
		this.custid = custid;
	}

	@Override
	public String toString() {
		return "Address [addresscode=" + addresscode + ", addressname=" + addressname + ", custid=" + custid + "]";
	}

	public int getAddresscode() {
		return addresscode;
	}

	public void setAddresscode(int addresscode) {
		this.addresscode = addresscode;
	}

	public String getAddressname() {
		return addressname;
	}

	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}
    
    
    
}
