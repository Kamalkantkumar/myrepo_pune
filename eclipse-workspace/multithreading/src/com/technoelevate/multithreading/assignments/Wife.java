package com.technoelevate.multithreading.assignments;

public class Wife extends Thread{
com.technoelevate.multithreading.assignments.Account acc;
	
	
	public Wife(com.technoelevate.multithreading.assignments.Account account) {
		this.acc = account;
	}



	public void run() {
		Thread.currentThread().setName("Wife thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
			acc.withdraw(3000);;
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		
	}

}
