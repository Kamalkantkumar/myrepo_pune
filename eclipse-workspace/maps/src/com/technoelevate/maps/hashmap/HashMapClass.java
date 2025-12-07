package com.technoelevate.maps.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.technoelevate.maps.basics.Student;

public class HashMapClass {

	public static void main(String[] args) {
     Map<Integer, Student> map=new HashMap<>();
     map.put(310, new Student("venkatesh", 51, 52.5, 65));
     map.put(310, new Student("balla venkatesh", 50, 52.5, 62));
     map.put(310, new Student("chowdary venkatesh", 51, 52.5, 60));
     map.put(310, new Student("b.venkatesh", 51, 52.5, 65));
     map.put(310, new Student("venkatesh", 45, 52.5, 68));
     map.put(310, new Student("venkatesh", 25, 52.5, 60));
     map.put(310, new Student("venkatesh", 26, 52.5, 65));
     
     Comparator<Student> comparator=(Student o1,Student o2)->{
 		return o1.getAge()-o2.getAge();
 		
 		
 	};

	} 
	
	}
	

	
     
     
     
     
	


