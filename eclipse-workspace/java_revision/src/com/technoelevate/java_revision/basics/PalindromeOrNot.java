package com.technoelevate.java_revision.basics;
import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int sum=0;
	int temp=num;
	while(num>0) {
		int r=num%2;
		 sum=sum*10+r;
		 num=num/10;
	}
	num=temp;
	if(num==sum) {
		System.out.println("it is a palindrome number");
	}
	else {
		System.out.println("not a palindrome number");
	}

	}

}
