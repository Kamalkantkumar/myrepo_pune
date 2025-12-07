package com.technoelevate.hashset;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetClass {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(25);
		hs.add(10);
		hs.add(85);
		hs.add(45);
		System.out.println("=====================using iterator ================");
		for (Object h : hs) {
			System.out.println(h);
		}
		System.out.println("============using itarator==========");
		@SuppressWarnings("rawtypes")
		Iterator iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=========size of the HashSet=========");
		System.out.println(hs.size());
		
	}

}


