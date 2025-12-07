package com.technoelevate.frirnds_detail_pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="friends")
public class Details_pojo {
	
	@Id
	private String id;
	private String name;
	private String clg_name;
	private String branch;
	private String marks;

}
