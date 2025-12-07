package com.technoelevate.threadmethods.synchronization;

public class Wife extends Thread{
	Account acc;
	
	
	public Wife(Account acc) {
		this.acc = acc;
	}



	public void run() {
		Thread.currentThread().setName("Wife thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
			acc.deposit(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
