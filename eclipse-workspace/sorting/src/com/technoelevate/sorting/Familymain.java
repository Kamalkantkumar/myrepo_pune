package com.technoelevate.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Familymain {

		public static void main(String[] args) {
	   ArrayList<FamilySort>arrayList=new ArrayList<FamilySort>();
	   arrayList.add(new FamilySort("father", 45, "krishna"));
	   arrayList.add(new FamilySort("sister", 29, "geetha"));
	   arrayList.add(new FamilySort("sister", 25, "saritha"));
	   arrayList.add(new FamilySort("mother", 38, "bharathi"));
	   Collections.sort(arrayList);
	   System.out.println(arrayList);
	   
		}

	

}


