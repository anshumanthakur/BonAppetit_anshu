package com.risk.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class OrderDetails {
	
	@Id
	int id;
	String name;
	int quantity;
	double price;
	double tot_amount;
	String comment;
	int empId;
	
	
	public OrderDetails() {
		
	}
	public OrderDetails(int id, String name, int quantity, double price, double tot_amount, String comment, int empId) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.tot_amount = tot_amount;
		this.comment = comment;
		this.empId = empId;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTot_amount() {
		return tot_amount;
	}
	public void setTot_amount(double tot_amount) {
		this.tot_amount = tot_amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
