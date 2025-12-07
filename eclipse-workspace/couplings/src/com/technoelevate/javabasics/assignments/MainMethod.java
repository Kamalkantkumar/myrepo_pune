package com.technoelevate.javabasics.assignments;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		FactoryClass classOne = new FactoryClass();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select Colleague fro user");
		System.out.println("1.Venkatesh\n2.Dhanunjay\n3.Nitish\n4.Gourav");
		System.out.println("Please Enter YourSelection/Choice");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1:
			classOne.getColleagues("Venkatesh").type();
			break;
		case 2:
			classOne.getColleagues("Dhanunjay").type();
			break;
		case 3:
			classOne.getColleagues("Nitish").type();
			break;
		case 4:
			classOne.getColleagues("Gourav").type();
			break;

		}

	}
}