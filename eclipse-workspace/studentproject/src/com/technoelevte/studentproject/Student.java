package com.technoelevte.studentproject;

import java.util.Comparator;

public class Student {
	int id;
	private String name;
	private int marks;
	      int age;
	private long num;
	
	public Student(int id, String name, int marks, int age, long num) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.num = num;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + ", num=" + num + "]";
	}
	//@Override
//	public int compareTo(Student o) {
//		return this.id-o.id;
	//}
	
	
	

}
