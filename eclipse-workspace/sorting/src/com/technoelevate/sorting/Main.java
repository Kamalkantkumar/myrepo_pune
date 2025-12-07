package com.technoelevate.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
   ArrayList<Trainer>arrayList=new ArrayList<Trainer>();
   arrayList.add(new Trainer("123", "friend", 0));
   arrayList.add(new Trainer("125", "just friend", 0));
   arrayList.add(new Trainer("null", "best", 0));
   arrayList.add(new Trainer("null", "friend", 0));
   arrayList.add(new Trainer("null", "just friend", 0));
   arrayList.add(new Trainer("null", "friend", 0));
   Collections.sort(arrayList);
   System.out.println(arrayList);
   
	}

}
