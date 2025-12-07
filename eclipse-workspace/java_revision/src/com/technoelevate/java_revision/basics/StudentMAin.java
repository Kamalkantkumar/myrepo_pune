package com.technoelevate.java_revision.basics;

public class StudentMAin {
	Heart heart=new Heart(35.5, 500.5);
	Brain brain=new Brain(800.5, 5);
	void hasA(Book b) {
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getPages());
		
	}
	void hasA(Bike bike) {
		System.out.println(bike.getClr());
		System.out.println(bike.getPrice());
		System.out.println(bike.getModel());
	}

}
