package com.technoelevate.sorting;

public class Person implements Comparable<Person>{
	String name;
	int age;
	String place;
	public Person(String name, int age, String place) {
		this.name = name;
		this.age = age;
		this.place = place;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", place=" + place + "]";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	

}
