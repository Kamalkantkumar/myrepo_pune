package com.technoelevte.builderdesignpattern;

public class PhoneMain {
	public static void main(String[] args) {
		BuilderClass builderClass=new BuilderClass().setBattery(6000).setProcessor("").setRam(6);
		System.out.println(builderClass);
		
	}
	
	

}
