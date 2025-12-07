package com.technoelevate.treeset;


import java.util.TreeMap;
import java.util.TreeSet;

public class PersonMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
      @SuppressWarnings("unused")
	TreeMap<Student,Integer>set=new TreeMap<>();
      @SuppressWarnings("rawtypes")
	TreeSet treeSet = new TreeSet();
	treeSet.add(new Student(310, 7799, 75, 21));
	treeSet.add(new Student(311, 7799, 75, 21));
	treeSet.add(new Student(310, 7799, 75, 21));
	treeSet.add(new Student(325, 7799, 75, 21));
	for(Object o: treeSet) {
	System.out.println(o);
	}
     System.out.println(set.entrySet());
}
}