package com.technoelevate.advancejavamock.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PracticeClass {

	public static void main(String[] args) {
       Set<Integer> list=new  LinkedHashSet<>();
         list.add(10);
         list.add(10);
         list.add(3);
         list.add(9);
         list.add(80);
         list.add(97);
         
         
        // System.out.println("2nd index value"+list.get(2));
       // Collections.sort(list,Collections.reverseOrder());
         list.forEach(System.out::println);
        //System.out.println(list.get(2));
	}

}
