package com.technoelevate.java8.defaultmethods;

public interface DefaultMethod {
	default  void sum() {
		System.out.println("sum using default");
		
	}
	static void sub() {
		System.out.println("sub using static");
	}

	void add();
}
