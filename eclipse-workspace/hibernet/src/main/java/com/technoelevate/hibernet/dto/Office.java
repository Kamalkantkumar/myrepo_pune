package com.technoelevate.hibernet.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Office {
	
	private int id;
	private String Company_name;
	@OneToMany(cascade =CascadeType.ALL  )
    private	List Employee;

}
