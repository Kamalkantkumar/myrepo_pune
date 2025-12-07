package com.technoelevate.java_revision.basics;

public class Book {
	private String name;
	private int price;
	private int pages;
	public Book(String name, int price, int pages) {
		this.name = name;
		this.price = price;
		this.pages = pages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
