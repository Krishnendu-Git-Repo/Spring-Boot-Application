package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tableproduct")
public class Product {
	@Id
   private int id;
   private String productname;
   private String productdesc;
   
   @JoinColumn(name="id",referencedColumnName = "productid")
   private List<Order> order;
   @JoinColumn(name="id",referencedColumnName = "productid")
   private List<ProductDetails> productdetails;
   
   public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(int id, String productname, String productdesc, List<Order> order, List<ProductDetails> productdetails) {
	super();
	this.id = id;
	this.productname = productname;
	this.productdesc = productdesc;
	this.order = order;
	this.productdetails = productdetails;
}

@Override
public String toString() {
	return "Product [id=" + id + ", productname=" + productname + ", productdesc=" + productdesc + ", order=" + order
			+ ", productdetails=" + productdetails + "]";
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

public String getProductdesc() {
	return productdesc;
}

public void setProductdesc(String productdesc) {
	this.productdesc = productdesc;
}

public List<Order> getOrder() {
	return order;
}

public void setOrder(List<Order> order) {
	this.order = order;
}

public List<ProductDetails> getProductdetails() {
	return productdetails;
}

public void setProductdetails(List<ProductDetails> productdetails) {
	this.productdetails = productdetails;
}



}
