package com.chenlaoda.cake.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="type")
public class Type {

	private int typeId;
	private String type;
	private Set<Cake_type> set1 = new HashSet<Cake_type>();
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@OneToMany
	@Cascade(value={CascadeType.ALL})
	@JoinColumn(name="typeId")
	public Set<Cake_type> getSet1() {
		return set1;
	}
	public void setSet1(Set<Cake_type> set1) {
		this.set1 = set1;
	}
	
}
