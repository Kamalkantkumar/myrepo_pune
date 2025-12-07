package com.technoelevate.java8;


public class Checking {
    
	
	
	public Checking() {
		System.out.println("Constructor");
	}
	public static void test() {
		System.out.println("testing the  static method reference");
	}
	public void test1() {
		System.out.println("testing the instance method reference");
	}
	public static void main(String[] args) {
		Runnable runnable=Checking::test;
		runnable.run();
		
		Checking checking=new Checking();
		runnable = checking::test1;
		runnable.run();
		
		//ListIterator<E>
	}
	

}
