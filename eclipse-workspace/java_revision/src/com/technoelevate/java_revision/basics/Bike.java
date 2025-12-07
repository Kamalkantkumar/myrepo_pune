package com.technoelevate.java_revision.basics;

public class Bike {
	private int price;
	private String clr;
	private String model;

	public Bike(int price, String clr, String model) {
		this.price = price;
		this.clr = clr;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getClr() {
		return clr;
	}

	public void setClr(String clr) {
		this.clr = clr;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
