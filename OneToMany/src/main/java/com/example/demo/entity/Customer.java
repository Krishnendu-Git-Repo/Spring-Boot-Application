package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	private int id;
	private String custname;
	private String custaddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="custid",referencedColumnName = "id")//name="foreign key", referencedColumnName="primery key"
	private List<Product> product;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String custname, String custaddress, List<Product> product) {
		super();
		this.id = id;
		this.custname = custname;
		this.custaddress = custaddress;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custname=" + custname + ", custaddress=" + custaddress + ", product=" + product
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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

	

	
	

}
