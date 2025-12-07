package com.technoelevate.sorting;

public class FamilySort implements Comparable<FamilySort> {
	String relation;
	int age;
	String name;
	public FamilySort(String relation, int age, String name) {
		this.relation = relation;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "FamilySort [relation=" + relation + ", age=" + age + ", name=" + name + "]";
	
	}
	@Override
	public int compareTo(FamilySort o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}