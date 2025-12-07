package com.technoelevate.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SortingTheArray {

	public static void main(String[] args) {
		Set<Integer> list = new LinkedHashSet<Integer>();
		list.add(10);
		list.add(80);
		list.add(60);
		list.add(74);
		list.add(8);
		list.add(12);
		//list.add(24);
		List<Integer> integers = new ArrayList<Integer>(list);
		// Collections.sort(integers);
		 Collections.reverseOrder();
		// list.forEach(System.out::println);
		list.remove(3);
		integers.forEach(System.out::println);

		
	}

}
