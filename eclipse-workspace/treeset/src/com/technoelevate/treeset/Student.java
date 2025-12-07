package com.technoelevate.treeset;

public class Student implements Comparable<Student>{
	int roolnum;
	int number;
	int percentage;
	int age;
	public Student(int roolnum, int number, int percentage, int age) {
		this.roolnum = roolnum;
		this.number = number;
		this.percentage = percentage;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "Student [roolnum=" + roolnum + ", number=" + number + ", percentage=" + percentage + ", age=" + age
				+ "]";
	}
	

}
