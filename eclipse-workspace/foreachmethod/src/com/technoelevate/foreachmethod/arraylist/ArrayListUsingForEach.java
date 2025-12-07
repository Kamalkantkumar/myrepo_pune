package com.technoelevate.foreachmethod.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListUsingForEach {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(17);
		arrayList.add(18);
		arrayList.add(12);
		arrayList.forEach(l->{System.out.println(l);});
      // Arrays.sort		
	
	
	}

}
