package com.technoelevate.advancejavamock.collections;

public class Threadusinglambda extends Thread {
	Runnable runnable = () -> {
		for (int i = 1; i < 10; i++) {
			System.out.println("Venkatesh Thread");
			try {
				Thread.sleep(2581);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Runnable runnable2 = () -> {
		for (int i = 0; i < 10; i++) {
			System.out.println("Venkatesh thread 2");
			
		}
	};

	public static void main(String[] args) {
		Threadusinglambda threadusinglambda = new Threadusinglambda();
		Thread thread = new Thread(threadusinglambda.runnable);
		Thread thread2 = new Thread(threadusinglambda.runnable2);
		thread.start();
		thread2.start();
		thread.setPriority(10);
		System.out.println(thread.getPriority());

	}
}
