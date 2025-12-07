package com.technoelevate.practice.list;

import java.util.Comparator;

@SuppressWarnings("serial")
public class StudentClass implements Comparator<StudentClass>{
	
	private int id;
	private String name;
	private String clgname;
	private int age;
	private double sal;
	
	
	public StudentClass(int id, String name, String clgname, int age, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.clgname = clgname;
		this.age = age;
		this.sal = sal;
	}
	public StudentClass() {
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
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", clgname=" + clgname + ", age=" + age + ", sal=" + sal
				;
	}
	
	@Override
	public int compare(StudentClass o1, StudentClass o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
