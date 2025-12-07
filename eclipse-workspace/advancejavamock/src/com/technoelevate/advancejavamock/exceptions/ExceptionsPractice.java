package com.technoelevate.advancejavamock.exceptions;

import java.util.Scanner;

public class ExceptionsPractice {

	public static void main(String[] args)  {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("enter a and b values");
		a = scan.nextInt();
		b = scan.nextInt();
		try {
		c = a / b;
		if (a > 10)
			throw new myException("\n enter a positive number");
		System.out.println(c);
		Exception exception=new Exception();
		
		}catch (Exception e) {
			System.out.println("please enter input less than 10");
		}
	}
}
