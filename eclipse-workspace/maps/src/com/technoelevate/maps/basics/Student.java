package com.technoelevate.maps.basics;


public class Student {
	private String name;
	private int id;
	private double per;
	private int age;
	public Student(String name, int id, double per, int age) {
		this.name = name;
		this.id = id;
		this.per = per;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + ", age=" + age + "]";
	}
	

}
