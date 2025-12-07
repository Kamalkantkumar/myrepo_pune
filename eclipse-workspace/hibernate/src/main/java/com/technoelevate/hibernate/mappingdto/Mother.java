package com.technoelevate.hibernate.mappingdto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Mother {
	@Id
	private int aadhar;
	private String name;
	private String loc;
	

}


