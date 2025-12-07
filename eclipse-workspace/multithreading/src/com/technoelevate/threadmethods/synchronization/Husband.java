package com.technoelevate.threadmethods.synchronization;

public class Husband extends Thread {
	Account acc;
	
	public Husband(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("husband thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
			acc.deposit(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			acc.deposit(3000);
		}
		
	}

}
