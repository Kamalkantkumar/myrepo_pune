package com.technoelevate.mvc.assignment.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping("/personal")
	public String personalDetails() {
		return "personal.jsp";

	}

	@RequestMapping("/education")
	public String educationDetails() {
		return "education.jsp";

	}

	@RequestMapping("/health")
	public String healthDetails() {

		return "health.jsp";
		


	}
	@GetMapping(path="/form")
	public String name() {
		return "form.jsp";
		
	}
	
//	@PostMapping(path="/formmain") 
//	public String name(ModelMap map, String name) {
//		map.addAttribute("user1",name);
//		return "formmain.jsp";
//		
//	}
	@PostMapping(path="/formmain1") 
	public String name1(ModelMap map, BeanClass name) {
		map.addAttribute("user1",name);
		return "formmain.jsp";
		
	}

}
