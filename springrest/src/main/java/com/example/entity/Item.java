package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sprin_rest")
public class Item {
	@Id
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	

}
