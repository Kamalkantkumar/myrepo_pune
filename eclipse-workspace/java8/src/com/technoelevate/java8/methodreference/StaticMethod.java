package com.technoelevate.java8.methodreference;

public class StaticMethod {
	public static void name() {
		System.out.println("static method in normal class");
	}

	public static void main(String[] args) {
	
		//FunInterface funInterface = StaticMethod::name;
		//funInterface.display(1);
		
		//StaticMethod method = new StaticMethod();
		//funInterface = method::sub;
		//funInterface.display(5);
	}

	public void sub() {
		System.out.println("non static method");

	}

}
