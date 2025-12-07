package com.technoelevate.manytomany;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	private String p_name;
	@ManyToMany
	@JoinTable(name = "pat_doc", joinColumns = @JoinColumn(referencedColumnName = "d_id"), inverseJoinColumns = @JoinColumn(referencedColumnName = "p_id"))
	private List<Doctor> doctors;
}
