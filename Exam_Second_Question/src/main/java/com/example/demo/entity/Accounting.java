package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="accounting")
public class Accounting {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	//private List<Sales> sales;
	
	public Accounting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accounting(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}

@Override
	public String toString() {
		return "Accounting [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}


    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//    public List<Sales> getSales() {
//		return sales;
//	}
// 
//    public void setSales(List<Sales> sales) {
//		this.sales = sales;
//	}

	
	

}
