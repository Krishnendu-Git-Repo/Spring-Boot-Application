package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="table")
public class ProductEntity {
	
	@Id
	private int id;
	private String name;
	private int code;
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductEntity(int id, String name, int code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	

}
