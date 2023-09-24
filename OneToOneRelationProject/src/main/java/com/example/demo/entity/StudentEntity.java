package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="student")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName = "stid")
	private CollegeEntity collegeEntity;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int id, String name, String address, CollegeEntity collegeEntity) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.collegeEntity = collegeEntity;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", address=" + address + ", collegeEntity="
				+ collegeEntity + "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CollegeEntity getCollegeEntity() {
		return collegeEntity;
	}

	public void setCollegeEntity(CollegeEntity collegeEntity) {
		this.collegeEntity = collegeEntity;
	}
	
	

}
