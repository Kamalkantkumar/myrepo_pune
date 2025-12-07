package com.te.springmvcdemo.service;

import java.util.List;

import com.te.springmvcdemo.dto.Employee;

public interface EmployeeService {

	public Employee validate(int id,String password);
	public Employee getData(int id);
	public int  deleteData(int Id);
	public boolean addData(int id, String name, String address, String password);
	public Boolean updateData(int id, String name);
	public List<Employee> seeAllDetails();
	
}
