package com.te.employeeform.model;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private int mobileNo;

	// for Current Address

	private String hno;
	private String city;
	private String state;
	private String pincode;

	// for Permanent Address

	private String hno1;
	private String city1;
	private String state1;
	private String pincode1;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getHno1() {
		return hno1;
	}

	public void setHno1(String hno1) {
		this.hno1 = hno1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getPincode1() {
		return pincode1;
	}

	public void setPincode1(String pincode1) {
		this.pincode1 = pincode1;
	}

}
