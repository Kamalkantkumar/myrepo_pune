package com.technoelevate.linkedlist.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee>list =new ArrayList<Employee>();
       list.add(new Employee(326, "venkatesh", 20, 3));
       list.add(new Employee(326, "virat", 22, 3));
       list.add(new Employee(326, "sai", 21, 3));
       list.add(new Employee(326, "darshith", 31, 3));
       list.add(new Employee(326, "ruthwik", 21, 3));
       list.add(new Employee(326, "venkatesh", 24, 3));
       Collections.sort(list,new ComparatorDemo());
       //System.out.println(list);
       for(Object o:list) {
    	   System.out.println(o);
       }
	}

}
