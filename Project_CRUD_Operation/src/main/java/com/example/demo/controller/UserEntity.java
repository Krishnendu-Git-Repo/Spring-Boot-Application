package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String username;
	private String useraddress;
	private int userpostcode;
	public UserEntity() {
		super();
	}
	
	public UserEntity(int userid, String username, String useraddress, int userpostcode) {
		super();
		this.userid = userid;
		this.username = username;
		this.useraddress = useraddress;
		this.userpostcode = userpostcode;
	}
	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", useraddress=" + useraddress
				+ ", userPostCode=" + userpostcode + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public int getUserpostcode() {
		return userpostcode;
	}
	public void setUserpostcode(int userpostcode) {
		this.userpostcode = userpostcode;
	}
	
    
}
