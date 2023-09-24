package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tableorderdetails")
public class OrderDetails {
	@Id
	private int id;
	private int orderid;
	private Date deliverydate;
	private String paymentmode;
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int id, int orderid, Date deliverydate, String paymentmode) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.deliverydate = deliverydate;
		this.paymentmode = paymentmode;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderid=" + orderid + ", deliverydate=" + deliverydate + ", paymentmode="
				+ paymentmode + "]";
	}
	
	

}
