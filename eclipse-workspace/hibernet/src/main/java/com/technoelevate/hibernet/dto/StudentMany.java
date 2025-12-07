package com.technoelevate.hibernet.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Entity
@Data
public class StudentMany {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE )
	private int id;
	private String name;
	@ManyToMany(targetEntity =Library.class )
	@Cascade(CascadeType.MERGE)
	List  list;
	
	public StudentMany(int id, String name, List list) {
		this.id = id;
		this.name = name;
		this.list = list;
	}
	
	
	
	

}
