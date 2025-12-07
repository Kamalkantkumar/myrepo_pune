package com.technoelevate.javabasics.assignments;
public class FactoryClass {
Collaegues colleagues=null;

	public Collaegues  getColleagues(String name) {
		if(name.equalsIgnoreCase("Venkatesh")) {
			colleagues = new Venkatesh();
		}else if(name.equalsIgnoreCase("Dhanunjay")) {
			colleagues=new Dhananjay();
		}else if(name.equalsIgnoreCase("Nitish")) {
			colleagues=new Nitish();
		}else {
			colleagues=new Gourav();
		}

		return colleagues;
	}

}
