package com.technoelevate.mockpreparation;

public class AbstractMain extends AbstractClass {

	public static void main(String[] args) {
		
		AbstractMe.sum();

	}

	@Override
	public
	void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}


}