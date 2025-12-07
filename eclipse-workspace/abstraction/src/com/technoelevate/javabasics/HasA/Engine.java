package com.technoelevate.javabasics.HasA;

public class Engine {
	int cc=110;
	int diaofcylinder=100;
	String type;
	
	public Engine(int cc, int diaofcylinder, String type) {
		super();
		this.cc = cc;
		this.diaofcylinder = diaofcylinder;
		this.type = type;
	}
	public void piston() {
		System.out.println("piston works");
	}
	public void cylinde() {
		System.out.println("engine works");
	}

}
