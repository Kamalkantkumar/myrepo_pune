package com.technoelevate.exceptions;

public class UsingTryCatch {
	 public static void main(String[] args) 	 {
		int a=10;
		int b=5;
		int c=a/b;
		try {
		if(c<10) {
			throw new  Exception();
		}
		}
		
			
		 catch (ArithmeticException e) {
			System.out.println("denominator not be zero");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
