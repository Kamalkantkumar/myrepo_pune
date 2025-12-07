package com.technoelevate.advancejavamock.threads;

public class ThreadbyLamda {
	
	public static void main(String[] args) {
		Runnable runnable=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("thread 1");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		Runnable runnable2=()->{
			System.out.println("thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread thread=new Thread();
		Thread thread2=new Thread();
		thread.start();
		thread2.start();
		thread2.setPriority(8);
		System.out.println(thread2.getName());
		thread.setName("balla venkatesh");
		System.out.println(thread.getName());
		
	}

}
