package com.technoelevate.linkedlist.basics;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMAin   {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList listMAin=new LinkedList();
		listMAin.add(10);
		listMAin.add(12);
		listMAin.add(85);
		listMAin.add(45);
		System.out.println("=====================using iterator ================");
		for(Object ob:listMAin) {
			System.out.println(ob);
		}
		System.out.println("============using itarator==========");
		@SuppressWarnings("rawtypes")
		Iterator iterator=listMAin.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
     
     
     }

}
