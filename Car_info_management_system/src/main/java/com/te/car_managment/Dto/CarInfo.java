package com.te.car_managment.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CarInfo {
	
	@Id
	private int car_id ;
	private String name ;
	private String company ;
	private String fuel_type ;
	private boolean power_steering ;
	private String break_system ;
	private double showroom_price ;
	private double onroad_price ;
	private String image_url ;
	private double milage ;
	private int seating_capacity ;
	private int engine_capacity ;
	private String gear_type ;
	
	
}
