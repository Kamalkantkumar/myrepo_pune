package com.technoelevate.hibernateonetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="city")
public class CityDto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cityid;
	private String cityname;
	@OneToMany(cascade =CascadeType.ALL )
	private StateDto dto;
	
	
	
	

}
