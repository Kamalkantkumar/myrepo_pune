package com.technoelevate.threadmethods.synchronization;

public class MainThread {

	public static void main(String[] args) {
		Account account=new Account(1000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
		account.checkBalance();

	}

}
