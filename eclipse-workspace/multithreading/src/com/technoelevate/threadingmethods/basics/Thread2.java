package com.technoelevate.threadingmethods.basics;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(93000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread2 running");
		
	}

}
