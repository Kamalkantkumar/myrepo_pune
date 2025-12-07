package com.technoelevate.multithreading.assignments;

public class Account {
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	public synchronized void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
		}
		else {
			balance=balance-amount;
			System.out.println("withdrawal sucessful");
			System.out.println("balance="+balance);
		}
		
		}
		
	
public  void deposit(int amount) {
	int temp =balance;
	temp=temp+amount;
	balance=temp;
	System.out.println("deposit sucessful");
	System.out.println("balance="+balance);
	
}
public void checkBalance() {
	System.out.println("balance="+balance);
	
}
}


