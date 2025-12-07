package com.technoelevate.javabasics.HasA;

public class VehicleMain {

	public static void main(String[] args) {
	
Tyres tyres=new Tyres("MRF", 18, 1800);

Engine engine=new Engine(15, 100,"v4");
Vehichle vehichle=new Vehichle ("black", "54885", engine, tyres);
vehichle.status();
	}

}
