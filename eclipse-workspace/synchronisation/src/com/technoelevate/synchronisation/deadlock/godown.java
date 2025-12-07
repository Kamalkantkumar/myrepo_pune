package com.technoelevate.synchronisation.deadlock;

public class godown {
	int product;

	public godown(int product) {
		this.product = product;
	}
	
	public synchronized void store(int noOfItems) {
		product += noOfItems;
		System.out.println("stored the products sucessfully");
		System.out.println("avaliable products =" + product);
		this.notify();
	}
	
	public synchronized void purchasr(int noOfItems) {
		while (noOfItems > product) {
			System.out.println("out of stock ||wait some time bugger");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		product -= noOfItems;
		System.out.println("purchase succesful\n avaliable products " + product);

	}

}
