package com.technoelevate.synchronisation.deadlock;

public class GodownManagement {

	public static void main(String[] args) {
		godown godown=new godown(100);
		Customer customer=new Customer(godown, 80);
		customer.start();
		@SuppressWarnings("unused")
		Customer customer2=new Customer(godown,60 );
		customer2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Manufacturer  manufacturer=new Manufacturer(godown, 50);
		manufacturer.start();

	}

}
