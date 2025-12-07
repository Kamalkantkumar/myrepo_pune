package com.technoelevate.threadingmethods.basics;

public class ThreadMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		
		Thread thread=new Thread(thread2);
		thread1.start();
		thread.start();
		thread1.yield();
		try {
			thread1.sleep(3000000000000L );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.join();

	}

}
