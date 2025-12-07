package com.technoelevate.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PersonCollection {
	
	public static void main(String[] args) {
	HashSet<Person>hashSet=new HashSet<Person>();
	hashSet.add(new Person("venkatesh",81,"kadapa"));
	hashSet.add(new Person("Avinash",21,"Anantapur"));
	hashSet.add(new Person("venkatesh",22,"kadapa"));
	hashSet.add(new Person("Dhanajay",21,"mh"));
	hashSet.add(new Person("venkatesh",41,"kadapa"));
	hashSet.add(new Person("balla venkatesh",11,"kadapa"));
	ArrayList<Person>arrayList=new ArrayList<Person>(hashSet);
	//Collections.sort(arrayList);
	Collections.sort(arrayList,new PersonDesendin());
	System.out.println(arrayList);
	}

}
