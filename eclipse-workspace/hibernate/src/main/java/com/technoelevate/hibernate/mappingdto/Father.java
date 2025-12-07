package com.technoelevate.hibernate.mappingdto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Father {
	@Id
	private int aadhar;
	private String name;
	private String loc;
	@OneToOne(cascade = CascadeType.ALL)
	private Mother mother;
	
	

}
