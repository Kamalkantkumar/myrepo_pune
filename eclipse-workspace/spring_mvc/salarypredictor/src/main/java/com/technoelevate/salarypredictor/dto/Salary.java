package com.technoelevate.salarypredictor.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Salary {
	
	@Id
	private String  emp_id;
	private String name;
	private Integer Mock1;
	private Integer Mock2;
	private Integer Mock3;
	private Integer Mock4;
	private Integer salary;

}
