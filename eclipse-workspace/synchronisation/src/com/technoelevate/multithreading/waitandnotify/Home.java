package com.technoelevate.multithreading.waitandnotify;

public class Home {
	int grocories;

	public Home(int grocories) {
		this.grocories = grocories;
	}
	public void takeGrocories(int noOfGrocries) {
		grocories+=noOfGrocries;
		System.out.println("grocaries are there in kitchen");
		System.out.println("avaliable groceries "+grocories);
		
	}
	public void useGrocaries(int requiredGrocaries) {
		while (requiredGrocaries > grocories) {
			System.out.println("wait until take the grocories from the market");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		grocories-=requiredGrocaries;
		System.out.println("sucessful ");
		System.out.println("balance grocories are "+grocories);
		
	}

	}
}
