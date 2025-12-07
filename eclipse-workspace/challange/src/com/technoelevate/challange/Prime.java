package com.technoelevate.challange;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number ");
		int count = 0;
		int n = scanner.nextInt();
		for (int i =1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("it is a prime number");
		} else {
			System.out.println("it is not a prime number");
		}

	}

}
