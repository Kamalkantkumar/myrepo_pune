package com.technoelevate.multithreading.assignments;


public class HusbandWifeMain {
	
	public static void main(String[] args) {
		Account account=new Account(8000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		husband.start();
		wife.start();
		account.checkBalance();

	}

}
