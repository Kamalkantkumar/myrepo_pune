package com.te.car_managment.Dto;

import lombok.Data;

@Data
public class CarData {
	
	private int carId ;
	private String carName ;
	private String carCompany;
	private String fuelType ;
	private String steering ;
	private String breakSystem ;
	private double showroomPrice ;
	private double onroadPrice ;
	private String image ;
	private double milage ;
	private int seatingCapacity ;
	private int engine ;
	private String gearType ;
}
