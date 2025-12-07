package com.te.employeeform.model;

public class Employee {

	private String empId;
	private String firstName;
	private String lastName;
	private String age;
	private String mobileNo;

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

	public Employee() {
	}

	public Employee(String empId, String firstName, String lastName, String age, String mobileNo, String hno, String city,
			String state, String pincode, String hno1, String city1, String state1, String pincode1) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mobileNo = mobileNo;
		this.hno = hno;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.hno1 = hno1;
		this.city1 = city1;
		this.state1 = state1;
		this.pincode1 = pincode1;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", hno=" + hno + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", hno1=" + hno1 + ", city1=" + city1 + ", state1=" + state1 + ", pincode1=" + pincode1
				+ "]";
	}

}