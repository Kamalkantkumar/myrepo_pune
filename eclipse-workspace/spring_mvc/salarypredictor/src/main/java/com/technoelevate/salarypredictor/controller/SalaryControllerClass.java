package com.technoelevate.salarypredictor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.salarypredictor.dto.Salary;
import com.technoelevate.salarypredictor.service.SalaryService;

@Controller
public class SalaryControllerClass {
	
	
	@Autowired
	SalaryService service;
	
	
	@GetMapping("/predict")
	public String name() {
		return "prediction.jsp";
		
	}
	
	
	@PostMapping("/predict")
	public String name1(String emp_id,String name,Integer Mock1,Integer Mock2,Integer Mock3,Integer Mock4,Integer salary,ModelMap map) {
		Salary predictSalary = service.predictSalary(emp_id, name, Mock1, Mock2, Mock3, Mock4, salary);
		
		map.addAttribute("msg",predictSalary);
		
		return "index.jsp";
		
	}

}
