package com.technoelevate.hibernateonetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name="state")
@Data
public class StateDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stateid;
	private String name;
	private String stateCm;
	private String capital;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "stateid")
	private List<CityDto> city;
	

}
