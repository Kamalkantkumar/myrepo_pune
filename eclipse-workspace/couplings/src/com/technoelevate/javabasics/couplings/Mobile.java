package com.technoelevate.javabasics.couplings;

import java.util.Objects;

public class Mobile {
String name;
double price;
int ram;
public Mobile(String name, double price, int ram) {
	super();
	this.name = name;
	this.price = price;
	this.ram = ram;
}
@Override
public String toString() {
	return "Mobile [name=" + name + ", price=" + price + ", ram=" + ram + "]";
}
@Override
public int hashCode() {
	return Objects.hash(name, price, ram);
}


}
