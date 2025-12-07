package com.technoelevate.java_revision.basics;

public class MainMethod {

	public static void main(String[] args) {
	StudentMAin Std =new StudentMAin();
	System.out.println(Std.heart.getBp());
	System.out.println(Std.heart.getWeight());
	System.out.println(Std.brain.getWeight());
	Bike bike=new Bike(44550, "black", "hero");
	Std.hasA(bike);

	}

}
