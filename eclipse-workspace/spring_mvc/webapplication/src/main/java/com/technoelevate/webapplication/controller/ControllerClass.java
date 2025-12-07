package com.technoelevate.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.webapplication.dto.EmployeeDto;
import com.technoelevate.webapplication.service.EmployeeService;
import com.technoelevate.webapplication.service.EmployserImpl;


@Controller
public class ControllerClass {

	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/search")
	public String name() {
		return "index.jsp";
		
	
		
	}
//	@PostMapping("/search") 
//	public String name1(ModelMap map,int eid) {
//		EmployeeDto data = service.getData(eid);
//		map.addAttribute("empid",data);
//		return "disp.jsp";

		
	//}
	@GetMapping("/insert")
	public String name2() {
		return "display.jsp";

	}
	
	@PostMapping("/insert")
	public String name3(ModelMap map,EmployeeDto dto) {
		EmployeeDto dto1=service.insertData1(dto);
		map.addAttribute("empid",dto);
		return "disp.jsp";
		
		
	}
	

}
