package com.technoelevate.synchronisation.deadlock;

public class Manufacturer extends Thread {
	godown godown;
	int noOfItems;

	public Manufacturer(com.technoelevate.synchronisation.deadlock.godown godown, int noOfItems) {
		this.godown = godown;
		this.noOfItems = noOfItems;
	}

	@Override
	public void run() {
		godown.store(noOfItems);
	}

}
