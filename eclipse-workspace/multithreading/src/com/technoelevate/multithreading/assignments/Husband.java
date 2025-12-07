package com.technoelevate.multithreading.assignments;


public class Husband extends Thread{
com.technoelevate.multithreading.assignments.Account acc;
	
	public Husband(com.technoelevate.multithreading.assignments.Account account) {
		this.acc = account;
	}

	public void run() {
		Thread.currentThread().setName("husband thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			
			acc.withdraw(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			//acc.withdraw(4000);
		}
		
	}

}
