package com.technoelevate.mvcproject4.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="flipkart" )
public class ProductDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int pid;
	private String pname;
	private String brand;
	private double price;

}
