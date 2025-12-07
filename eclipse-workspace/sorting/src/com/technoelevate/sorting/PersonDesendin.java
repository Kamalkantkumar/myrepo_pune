package com.technoelevate.sorting;

import java.util.Comparator;

public class PersonDesendin implements Comparator<Person>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.age-o1.age;
	}

}
