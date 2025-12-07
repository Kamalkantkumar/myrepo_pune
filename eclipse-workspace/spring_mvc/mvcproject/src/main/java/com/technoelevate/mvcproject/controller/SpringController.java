package com.technoelevate.mvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
//	@RequestMapping("/add")
//	public String add() {
//		System.out.println("success");
//		return "hello.jsp";
//		
	//}
	@RequestMapping(path="/redirect")
	public String  hello() {
		return "redirect:https://technoelevate.com/technology.html";
		
	}
	@RequestMapping(path="/forward")
	public String  hello1() {
		return "forward:https://learn.thetapacademy.com/enrollments";
		
	}
	

}
