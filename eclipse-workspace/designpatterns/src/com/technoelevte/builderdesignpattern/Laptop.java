package com.technoelevte.builderdesignpattern;

public class Laptop {
	private int price;
	private String brand;
	private int ram;
	private int storage;
	
	public Laptop(int price, String brand, int ram, int storage) {
		this.price = price;
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
	
	

}
