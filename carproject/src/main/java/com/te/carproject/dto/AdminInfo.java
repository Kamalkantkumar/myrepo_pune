package com.te.carproject.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AdminInfo {
	
	@Id
	private int admin_id ;
	private String admin_name ;
	private String admin_password ;

}

