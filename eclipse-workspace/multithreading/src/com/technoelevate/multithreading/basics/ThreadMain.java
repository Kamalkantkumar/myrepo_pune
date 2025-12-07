package com.technoelevate.multithreading.basics;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadByInterFace byInterFace=new ThreadByInterFace();
		 Thread thread = new Thread(byInterFace);
		 thread.start();
		 for(;;)
		 System.out.println("hi==========================");
		// System.out.println("helooooooooooooooooooooooooo");
		 

	}

}
