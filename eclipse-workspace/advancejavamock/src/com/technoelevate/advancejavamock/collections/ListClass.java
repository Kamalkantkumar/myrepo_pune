package com.technoelevate.advancejavamock.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListClass {
	public static void main(String[] args) {
		Set<StudentClass> classes=new HashSet<StudentClass>();
		classes.add(new StudentClass(10,12));
		classes.add(new StudentClass(25,120));
		classes.add(new StudentClass(1,1258));
		classes.add(new StudentClass(100,12));
		List<StudentClass> classes2=new LinkedList<StudentClass>(classes);
		
		Comparator<StudentClass> comparator=(StudentClass o1, StudentClass o2)->{
			return o2.id-o1.id;
		};
//		Comparable<StudentClass> comparable=(StudentClass o1)->{
//			//return 
//		};
		
		Collections.sort(classes2,comparator);
		
		classes2.forEach(System.out::println);
	}


}
