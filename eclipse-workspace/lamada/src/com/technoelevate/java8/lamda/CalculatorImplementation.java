package com.technoelevate.java8.lamda;

public class CalculatorImplementation {

	public static void main(String[] args) {
       Calculator calculator=(int a,int b)->{
    	   int c=a+b;
		return c;
    	   
       };
       System.out.println(calculator.sum(10,5));
       
	}

}
