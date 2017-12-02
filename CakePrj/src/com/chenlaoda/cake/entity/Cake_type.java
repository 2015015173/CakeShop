package com.chenlaoda.cake.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cake_type")
public class Cake_type {

	private int id;
	private int cakeId;
	private int typeId;
	@Id
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
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
}
