package com.te.springmvcdemo.dao;

import java.util.List;

import com.te.springmvcdemo.dto.Employee;

public interface EmployeeDao {

	public Employee validate(int id,String password);

	public Employee getData(int id);

	public int deleteData(int id);

	public boolean addData(int id, String name, String address, String password);

	public Boolean updateData(int id, String name);

	public List<Employee> seeAllDetails();
	
	
}

