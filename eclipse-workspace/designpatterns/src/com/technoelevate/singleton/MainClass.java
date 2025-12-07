package com.technoelevate.singleton;

public class MainClass{

	public static void main(String[] args) {
    Movie booking = Movie.getBooking(30); 
    System.out.println("-------------------------------------------");
    Movie booking2 = Movie.getBooking(50);
    System.out.println("-------------------------------------------");
    Movie booking3 = Movie.getBooking(15);	
	}
}
