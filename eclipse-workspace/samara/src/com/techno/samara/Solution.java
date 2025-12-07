package com.techno.samara;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static  Double res;
	public static void main(String[] args) {
		averageProteinByType();
		sortCornByPrice();
	}

	public static void averageProteinByType() {
		ArrayList<Corn> corns = new ArrayList<Corn>();
		corns.add(new Corn("sweet", "ambrosia hybrid", 3.7, 101));
		corns.add(new Corn("flint", "zea mays", 2.8, 30));
		corns.add(new Corn("sweet", "golden bantan", 3.1, 91));
		corns.add(new Corn("sweet", "ruby Queen", 2.2, 45));
		corns.add(new Corn("sweet", null, 0.0, 99));
		for (Corn corn : corns) {			
			res = corn.getProtien();
		}
		System.out.println(res);
	}
	public static void sortCornByPrice() {
		ArrayList<Corn> corns = new ArrayList<Corn>();
		ArrayList<Corn> corns1 = new ArrayList<Corn>();
		corns1.add(new Corn("sweet", "ambrosia hybrid", 3.7, 101));
		corns1.add(new Corn("flint", "zea mays", 2.8, 30));
		corns1.add(new Corn("sweet", "golden bantan", 3.1, 91));
		corns1.add(new Corn("sweet", "ruby Queen", 2.2, 45));
		corns1.add(new Corn("sweet", null, 0.0, 99));

		Collections.sort(corns1);

		for (Corn corn : corns1) {
			System.out.println(corn.getCornName());

		}
	}

}
