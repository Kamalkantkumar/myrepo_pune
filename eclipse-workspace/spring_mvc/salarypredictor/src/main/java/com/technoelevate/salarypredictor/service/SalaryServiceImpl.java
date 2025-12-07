package com.technoelevate.salarypredictor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.salarypredictor.dao.SalaryDao;
import com.technoelevate.salarypredictor.dto.Salary;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	
	@Autowired
	SalaryDao dao;

	@Override
	public Salary predictSalary(String emp_id,String name,Integer Mock1,Integer Mock2,Integer Mock3,Integer Mock4,Integer salary) {
		
		return dao.predictSalary(emp_id, name, Mock1, Mock2, Mock3, Mock4, salary);
		
	}

}
