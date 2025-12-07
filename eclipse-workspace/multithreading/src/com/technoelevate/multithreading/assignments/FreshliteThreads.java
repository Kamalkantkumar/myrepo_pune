package com.technoelevate.multithreading.assignments;

public class FreshliteThreads implements Runnable{

	@Override
	public void run() {
		System.out.println("hello all");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
