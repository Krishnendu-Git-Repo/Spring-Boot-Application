package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tableproductdetails")
public class ProductDetails {
	@Id
	private int id;
	private String color;
	private String size;
	private int productid;
	
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetails(int id, String color, String size, int productid) {
		super();
		this.id = id;
		this.color = color;
		this.size = size;
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", color=" + color + ", size=" + size + ", productid=" + productid + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	

}
