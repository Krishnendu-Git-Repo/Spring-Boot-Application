package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	private int id;
	private String custname;
	private String custaddress;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private ProductEntity pd;

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(int id, String custname, String custaddress, ProductEntity pd) {
		super();
		this.id = id;
		this.custname = custname;
		this.custaddress = custaddress;
		this.pd = pd;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", custname=" + custname + ", custaddress=" + custaddress + ", pd=" + pd
				+ "]";
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

	public ProductEntity getPd() {
		return pd;
	}

	public void setPd(ProductEntity pd) {
		this.pd = pd;
	}
	
	    
}
