package com.technoelevate.webapplication.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_details")
public class EmployeeDto {
	@Id
	private int eid;
	private String password;
	private String ename;
	private String position;
}
