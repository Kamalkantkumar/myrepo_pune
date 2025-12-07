package com.technoelevate.advancejavamock.collections;

public class Threadings extends Thread {

	public static void main(String[] args) {
		Threadings thread = new Threadings();
		thread.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
		}

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("run method");
		}
		super.run();
	}
//      Runnable runnable=()->{
//    	  for(int i=0;i<=10;i++) {
//    		  System.out.println("thread 1 is running");
//    	  }
//      };
//      Runnable runnable2=()->{
//    	  for(int i=0;i<=10;i++) {
//    		  System.out.println("thread 2 is running");
//    	  }
//      };
}
