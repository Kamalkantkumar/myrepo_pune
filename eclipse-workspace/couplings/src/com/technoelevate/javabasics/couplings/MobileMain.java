package com.technoelevate.javabasics.couplings;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile=new Mobile("samsung", 14558, 4);
		Mobile mobile2=new Mobile("iphone",15959,3);
		System.out.println(mobile);
		System.out.println(mobile2);
		System.out.println(mobile.hashCode());
		System.out.println(mobile.hashCode());
		System.out.println(mobile2.hashCode());



	}

}
