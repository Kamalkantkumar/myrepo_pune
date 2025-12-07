package com.technoelevate.hibernet.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;


@Entity
@Data
public class Library {
	
	@Id
	private int id;
	private String book_name;
	
	@ManyToMany(targetEntity =StudentMany.class ) 
	@Cascade(CascadeType.MERGE)
	private List list1;

	public Library(int id, String book_name, List list1) {
		this.id = id;
		this.book_name = book_name;
		this.list1 = list1;
	}

	
}
