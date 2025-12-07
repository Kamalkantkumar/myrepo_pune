package com.te.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.springmvcdemo.dao.EmployeeDao;
import com.te.springmvcdemo.dto.Employee;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee validate(int id, String password) {
		if (id > 0) {
			return employeeDao.validate(id, password);// employee object
		}
		return null;
	}

	@Override
	public Employee getData(int id) {
		if (id > 0) {
			return employeeDao.getData(id);
		}
		return null;
	}

	@Override
	public int deleteData(int id) {
		if (id > 0) {
			return employeeDao.deleteData(id);
		}
		return 0;
	}

	@Override
	public boolean addData(int id, String name, String address, String password) {
		if(id>0)
		{
			return employeeDao.addData(id,name,address,password);
		}
		return false;
	}

	@Override
	public Boolean updateData(int id, String name) {
		if(id>0)
		{
			return employeeDao.updateData(id,name);
		}
		return null;
	}

	@Override
	public List<Employee> seeAllDetails() {
		
		List<Employee> list=employeeDao.seeAllDetails();
		if(list!=null)
			return list;
		else
			return null;
	}
}
