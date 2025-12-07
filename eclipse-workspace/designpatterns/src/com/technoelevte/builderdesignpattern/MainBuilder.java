package com.technoelevte.builderdesignpattern;

public class MainBuilder {

	public static void main(String[] args) {
     BuilderLaptopClass builderLaptopClass=new BuilderLaptopClass().setBrand(null).setPrice(53658);
		
		System.out.println(builderLaptopClass);
	}

}
