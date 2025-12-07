package com.techno.samara;

public class Corn implements Comparable<Corn>{
	
	private String cornType;
	private String cornName;
	private double protien;
	private int price;
	public Corn(String cornType, String cornName, double protien, int price) {
		this.cornType = cornType;
		this.cornName = cornName;
		this.protien = protien;
		this.price = price;
	}
	public String getCornType() {
		return cornType;
	}
	public void setCornType(String cornType) {
		this.cornType = cornType;
	}
	public String getCornName() {
		return cornName;
	}
	public void setCornName(String cornName) {
		this.cornName = cornName;
	}
	public double getProtien() {
		return protien;
	}
	public void setProtien(double protien) {
		this.protien = protien;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Corn [cornType=" + cornType + ", cornName=" + cornName + ", protien=" + protien + ", price=" + price
				+ "]";
	}
	@Override
	public int compareTo(Corn o) {
		// TODO Auto-generated method stub
		return 
				o.price-this.price;
	}
	
	

}
