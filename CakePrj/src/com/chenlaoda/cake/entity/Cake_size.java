package com.chenlaoda.cake.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cake_size")
public class Cake_size {

	@Id
	private int id;
	private int cakeId;
	private int sizeId;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	public int getSizeId() {
		return sizeId;
	}
	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
