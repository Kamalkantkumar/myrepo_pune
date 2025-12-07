package com.technoelevate.advancejavamock.collections;

import java.util.Comparator;

public class Product {
	String pname;
     int price;
	double qty;
	public Product(String pname, int price, double qty) {
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}
	
	//@Override
//	public int compareTo(Product o) {
//		return (int) (this.price-o.price);
//	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	

}
