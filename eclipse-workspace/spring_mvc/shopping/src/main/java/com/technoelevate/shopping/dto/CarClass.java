package com.technoelevate.shopping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CarClass {

	
	
	@Id
	private String id;
	private String name;
	private String company;
	private String fuel_type;
	private String break_system;
	private double showroom_price;
	private double onroad_price;
	private String image_url;
	private String milage;
	private String seating_capacity;
	private String engine_capacity;
	private String gear_type;
	private String power_steering;

}
