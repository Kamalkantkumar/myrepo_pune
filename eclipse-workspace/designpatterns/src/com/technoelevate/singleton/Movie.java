package com.technoelevate.singleton;

public class Movie {
	private static Movie movie;
	static int tickets=50;
	private Movie() {
		System.out.println("inside constructor");
	}
	public static Movie getBooking(int noOfBookings) {
		if(movie==null) {
			movie=new Movie();
		}
		System.out.println("total tickets avaliable:"+tickets);
		System.out.println("the tickets which are booked :"+noOfBookings);
		tickets=tickets-noOfBookings;
		System.out.println("avaliable="+tickets);		
		return movie;
	}

}
