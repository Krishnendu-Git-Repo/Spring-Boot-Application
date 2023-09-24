package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
 
@Id
 private int id;
 private String custname;
 private String custaddress;
 
 @OneToOne
 @JoinColumn(name="id",referencedColumnName = "id")
 private Product product;

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public Customer(int id, String custname, String custaddress, Product product) {
	super();
	this.id = id;
	this.custname = custname;
	this.custaddress = custaddress;
	this.product = product;
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

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}


}
