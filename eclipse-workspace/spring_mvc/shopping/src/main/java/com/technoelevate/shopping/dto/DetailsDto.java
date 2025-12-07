package com.technoelevate.shopping.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="online" )
public class DetailsDto implements Serializable{
	
	@Id
	private String number;
	private String password;
	private String password1;
	private String email;
	private String name;
	private String gender;
	private String dob;
	private String url;

}
