package com.technoelevate.practice.list;

import java.util.ArrayList;
import java.util.Collections;


public class ListClass {
	public static void main(String[] args) {
		ArrayList<StudentClass> list=new ArrayList<StudentClass>();
		list.add(new StudentClass(101, "venkatesh", "aits", 5454, 147));
		list.add(new StudentClass(1154, "pranadeep", "aits", 5454, 147));
		list.add(new StudentClass(1147, "pranadeep", "aits", 5454, 147));
		list.add(new StudentClass(11, "pranadeep", "aits", 5454, 147));
		Collections.sort(list,new StudentClass());
		for (StudentClass studentClass : list) {
			System.out.println(studentClass);
			
			
			
			
		}
		
		
	}
	
	
	

}
