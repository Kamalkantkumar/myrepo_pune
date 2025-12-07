package com.technoelevate.synchronisation.deadlock;

public class Customer extends Thread{
	godown godown;
	int noOfItems;
	public Customer(com.technoelevate.synchronisation.deadlock.godown godown, int noOfItems) {
		this.godown = godown;
		this.noOfItems = noOfItems;
	}
	@Override
	public void run() {
		godown.purchasr(noOfItems);
		
	}

}
