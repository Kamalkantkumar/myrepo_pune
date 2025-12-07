package com.technoelevate.java8.lamdaexpressions;

public class CarImplementation {

	public static void main(String[] args) {
	CarInterface carInterface=()->{
		System.out.println("car model is hundai");
		System.out.println("2016 registration year");
		System.out.println("approximate price 200000");
	};
	carInterface.carDetails();

	}

}
