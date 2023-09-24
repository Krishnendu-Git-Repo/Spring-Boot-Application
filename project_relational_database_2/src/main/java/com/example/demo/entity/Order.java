package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tableorder")
public class Order {
	@Id
	private int id;
	private Date orderdate;
	private int customerid;
	private int productid;
	
	@JoinColumn(name="id",referencedColumnName = "orderid")
	private List<OrderDetails> orderdetails;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, Date orderdate, int customerid, int productid, List<OrderDetails> orderdetails) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.customerid = customerid;
		this.productid = productid;
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderdate=" + orderdate + ", customerid=" + customerid + ", productid="
				+ productid + ", orderdetails=" + orderdetails + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public List<OrderDetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetails> orderdetails) {
		this.orderdetails = orderdetails;
	}
	
	
}
