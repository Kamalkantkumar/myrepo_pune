package com.technoelevate.advancejavamock.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class arraysortig {
	public static void main(String[] args) {
		Queue<Integer> integers=new PriorityQueue<Integer>();
		integers.add(0);
		integers.add(0);
		integers.add(0);
		integers.add(0);
		integers.add(0);
		integers.add(78);
		integers.add(0);
		integers.add(0);
		integers.add(0);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(1);
		integers.add(7);
		integers.forEach(System.out::println);
		List<Integer> integers2=new LinkedList<Integer>(integers);
		System.out.println("Ascending order");
		Collections.sort(integers2);
		integers2.forEach(System.out::println);
		System.out.println("descending order");
		Collections.sort(integers2,Collections.reverseOrder());
		integers2.forEach(System.out::println);	

	
	}
}
