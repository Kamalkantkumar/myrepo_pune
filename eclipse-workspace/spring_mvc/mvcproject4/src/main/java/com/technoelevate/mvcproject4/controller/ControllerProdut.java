package com.technoelevate.mvcproject4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.technoelevate.mvcproject4.dto.ProductDto;
import com.technoelevate.mvcproject4.service.ProductService;

@Controller
public class ControllerProdut {
	
	@Autowired
	ProductService service;
	
	
	@GetMapping("/insert")
	public String insert() {
		return "insert.jsp";
		
	}
	
	@PostMapping("/insert")
	public String insert1(ModelMap map,int pid,String pname,String brand,double price) {
		ProductDto dto=service.insert(pid, pname, brand, price);
		dto.setPid(pid);
		dto.setPname(pname);
		dto.setBrand(brand);
		dto.setPrice(price);
		map.addAttribute("dtoKey",dto);
		return "display.jsp";
		
	}
	@GetMapping("/delete")
	public String delete() {
		return "delete.jsp";
	}
	@PostMapping("/delete")
	public  String name(ModelMap map,int pid) {
		ProductDto delete = service.delete(pid);
		delete.setPid(pid);
		map.addAttribute("dtokey", delete);
		return "display.jsp";	
	}
	@GetMapping("/login")
	public String login() {
			
		return "login.jsp";
		
	}
	
	@PostMapping("/login")
	public String name6(ModelMap map,int pid,String pname) {
		ProductDto dto = service.login(pid, pname);
		if(dto!=null){
			String msg="login succesful";
			map.addAttribute("message",msg);
		}else {
			String msg="login unsuccesful";
			map.addAttribute("message",msg);
		}
		return "display.jsp";
		
	}
	

}
