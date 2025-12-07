package com.technoelevate.salarypredictor.dao;

import com.technoelevate.salarypredictor.dto.Salary;

public interface SalaryDao {
	
	public Salary predictSalary(String emp_id,String name,Integer Mock1,Integer Mock2,Integer Mock3,Integer Mock4,Integer salary);
		
	

}
