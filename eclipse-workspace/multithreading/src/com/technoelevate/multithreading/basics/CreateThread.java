package com.technoelevate.multithreading.basics;

public class CreateThread extends Thread {

	public static void main(String[] args) {
		CreateThread createThread = new CreateThread();
		Thread.currentThread().setPriority(9);
		
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("hello hiii");
		createThread.start();
		

	}

	@Override
	public void run() {
		System.out.println("hello");
		CreateThread.currentThread().setName("venkatesh");
		System.out.println(CreateThread.currentThread().getName());
		
	}

	public void run(int s) {
		System.out.println("hello");
	}

}
