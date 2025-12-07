package com.technoelevate.linkedlist.studentsdetails;

public class StudentsDetails implements Comparable<StudentsDetails>{
	private String name;
	private String ht;
	private double percentage;
	private String branch;
	public StudentsDetails(String i, String ht, double percentage, String branch) {
		this.name = i;
		this.ht = ht;
		this.percentage = percentage;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHt() {
		return ht;
	}
	public void setHt(String ht) {
		this.ht = ht;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "StudentsDetails [name=" + name + ", ht=" + ht + ", percentage=" + percentage + ", branch=" + branch
				+ "]";
	}
	@Override
	public int compareTo(StudentsDetails o) {
		
		return this.getName().compareTo(o.getName());
	}
	

}
