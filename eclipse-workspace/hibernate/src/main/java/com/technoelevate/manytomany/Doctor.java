package com.technoelevate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int d_id;
	private String D_name;
	@ManyToMany(cascade = CascadeType.ALL)
	//@JoinTable(name="doc_pat",joinColumns=@JoinColumn(referencedColumnName = "p_id"),inverseJoinColumns=@JoinColumn(referencedColumnName = "d_id"))
	@JoinTable(name ="doc",joinColumns =@JoinColumn(referencedColumnName ="p_id"),inverseJoinColumns =@JoinColumn(referencedColumnName ="d_id"))
	List<Patient> list;	

}
