package com.technoelevate.hibernatemanytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Box {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int boxid;
	private String boxname;
	
	private int qty;
	
	

}
