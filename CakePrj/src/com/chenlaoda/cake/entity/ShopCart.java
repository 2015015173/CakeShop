package com.chenlaoda.cake.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopcart")
public class ShopCart {

	private int userId;
	private int cakeId;
	private int number;
	private int size;
	@Id
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
