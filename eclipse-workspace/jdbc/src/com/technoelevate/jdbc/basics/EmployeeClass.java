package com.technoelevate.jdbc.basics;

public class EmployeeClass {
	private int eid;
	private String ename;
	private String desig;
	private int sal;
	private int age;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeClass [eid=" + eid + ", ename=" + ename + ", desig=" + desig + ", sal=" + sal + ", age=" + age
				+ "]";
	}
	
	
	

}
