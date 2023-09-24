package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	
	@Id
	private Integer stid;
	private String stname;
	private Integer strollno;
	
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentEntity(Integer stid, String stname, Integer strollno) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.strollno = strollno;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Integer getStrollno() {
		return strollno;
	}

	public void setStrollno(Integer strollno) {
		this.strollno = strollno;
	}

	
	
	

}
