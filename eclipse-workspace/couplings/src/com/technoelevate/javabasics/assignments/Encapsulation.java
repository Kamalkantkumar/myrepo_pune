package com.technoelevate.javabasics.assignments;

public class Encapsulation {
private	String name;
private	int empid;
private	int mobilenum;
private String startTime;
private String endTime;
public Encapsulation(String name, int empid, int mobilenum, String startTime, String endTime) {
	super();
	this.name = name;
	this.empid = empid;
	this.mobilenum = mobilenum;
	this.startTime = startTime;
	this.endTime = endTime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getMobilenum() {
	return mobilenum;
}
public void setMobilenum(int mobilenum) {
	this.mobilenum = mobilenum;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}

	

}
