package com.technoelevate.multithreading.assignments;

public class FreshMain {

	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) {
		FreshliteThreads freshliteThreads = new FreshliteThreads();
		Thread thread = new Thread(freshliteThreads);
		Freshlite1 freshlite1 = new Freshlite1();
		Thread thread2 = new Thread(freshlite1);
		thread.setPriority(7);
		thread2.setPriority(2);
		thread.start();
		thread2.start();
		
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());

		thread.setName("Freshlight-03(j)");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(thread.currentThread().getPriority());
		

		
		Thread.currentThread().setName("Freshlight-03(r)");
		
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(thread2.currentThread().getPriority());

		
	}

}
/*  The main purpose of multithreading is to provide simultaneous execution of two or more parts of a program to maximum utilize the CPU time.
 *  A multithreaded program contains two or more parts that can run concurrently. ... Threads are lightweight sub-processes, they share the common memory space.
 */