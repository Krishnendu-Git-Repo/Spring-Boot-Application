package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student_table")
public class StudentEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;
	private int rollno;
	private String studentname;
	private String studentaddress;
	private String studentdept;
	
	public StudentEntity() {
		super();
	}

	public StudentEntity(int studentid, int rollno, String studentname, String studentaddress, String studentdept) {
		super();
		this.studentid = studentid;
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.studentdept = studentdept;
	}
	

	@Override
	public String toString() {
		return "StudentEntity [studentid=" + studentid + ", rollno=" + rollno + ", studentname=" + studentname
				+ ", studentaddress=" + studentaddress + ", studentdept=" + studentdept + "]";
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	public String getStudentdept() {
		return studentdept;
	}

	public void setStudentdept(String studentdept) {
		this.studentdept = studentdept;
	}
	
	

}
