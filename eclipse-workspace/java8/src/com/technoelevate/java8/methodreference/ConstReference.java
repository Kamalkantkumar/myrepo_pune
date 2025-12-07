package com.technoelevate.java8.methodreference;

public class ConstReference {
	

	public ConstReference(int i) {
System.out.println("constructor ref");	
}

	public static void main(String[] args) {
		FunInterface funInterface=ConstReference::new;
		funInterface.display(10);

	}

}
