package com.technoelevte.builderdesignpattern;

public class BuilderLaptopClass {
	
	private int price;
	private String brand;
	private int ram;
	private int storage;
	
	
	public BuilderLaptopClass setPrice(int price) {
		this.price = price;
		return this;
	}
	public BuilderLaptopClass setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public BuilderLaptopClass setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public BuilderLaptopClass setStorage(int storage) {
		this.storage = storage;
		return this;
	}
	public Laptop name() {
		return new Laptop(price, brand, price, price);
		
	}
	@Override
	public String toString() {
		return "BuilderLaptopClass [price=" + price + ", brand=" + brand + ", ram=" + ram + ", storage=" + storage
				+ "]";
	}
	
  
}
