package com.technoelevate.javabasics.exceptions;

import java.io.IOException;

public class Throw {
	public static void methodOne() {
	
		System.out.println("hello");
	}
	public static  void methodTwo() {
		methodOne();
		System.out.println("hii");
		
	}
    public static void methodThree() throws IOException {
    	methodTwo();
    	System.out.println("bugger");
    	throw new IOException();
    	
    }
    public static void main(String[] args) throws IOException {
		methodTwo();
		
	}
}
