package com.technoelevate.linkedlist.comparators;

public class Employee implements Comparable<Employee>{
int empid;
String name;
int age;
int sal;
public Employee(int empid, String name, int age, int sal) {
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.sal = sal;
}

@Override
public int compareTo(Employee o) {
	
	return this.name.compareTo(o.name);
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
}

}

