package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="college")
public class CollegeEntity {
	
	@Id
	private int id;
	private String name;
	private int code;
	private int stid;
	
	public CollegeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollegeEntity(int id, String name, int code, int stid) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.stid = stid;
	}

	@Override
	public String toString() {
		return "CollegeEntity [id=" + id + ", name=" + name + ", code=" + code + ", stid=" + stid + "]";
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

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}
	
	

}
