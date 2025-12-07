package com.technoelevate.java8.lamda;

public class RunnableUsingLamda {

	public static void main(String[] args) {
   @SuppressWarnings("unused")
Runnable runnable=()->{
	   System.out.println("my thread");
	   for (int i = 0; i < 10; i++) {
		   System.out.println("my thread running1😂😂😂😂😂😂😂🤣🤣❤❤");
		
	}
   };
   runnable.run();
	}

}
