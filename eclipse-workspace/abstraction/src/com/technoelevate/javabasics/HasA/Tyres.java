package com.technoelevate.javabasics.HasA;

public class Tyres {
String type;
int size;
int price;
public Tyres(String type, int size, int price) {
	super();
	this.type = type;
	this.size = size;
	this.price = price;
}
@Override
public String toString() {
	return "Tyres [type=" + type + ", size=" + size + ", price=" + price + "]";
}

}
