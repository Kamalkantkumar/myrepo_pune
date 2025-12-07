package com.technoelevate.springjson.bean;

import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data 
@JsonPropertyOrder()
public class Student {
	
	@JsonProperty("sid")
	private int id;
	private String password;
	private String name;
	private String dept;
	private String loc;
	private double percentage;

}
