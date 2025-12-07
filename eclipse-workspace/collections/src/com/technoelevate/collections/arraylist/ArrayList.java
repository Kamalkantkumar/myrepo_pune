package com.technoelevate.collections.arraylist;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList {
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {//main method
		@SuppressWarnings("rawtypes")
		java.util.ArrayList arrayList = new java.util.ArrayList();//arraylist implementation
		arrayList.add(88);
		arrayList.add(85);
		arrayList.add("hello");
		arrayList.add(10);
		System.out.println(arrayList);//printing the list
	    System.out.println("===========using for loop");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));//printing using loop
		}
	for (Object object : arrayList) {
			System.out.println(object);//using foreach loop
		}
       @SuppressWarnings({ "rawtypes" })
		Iterator iterator=arrayList.iterator();
       System.out.println("========using forward============");
        while(iterator.hasNext()) {
       	System.out.println(iterator.next()); //using list iterator
       	}
        @SuppressWarnings("rawtypes")
		ListIterator iterator2=arrayList.listIterator(5);
        System.out.println("========using backward============");
        while(iterator2.hasPrevious()) {
        	System.out.println(iterator2.previous());     	
        }
	}

	public void add(int i) {
		
	}

}
