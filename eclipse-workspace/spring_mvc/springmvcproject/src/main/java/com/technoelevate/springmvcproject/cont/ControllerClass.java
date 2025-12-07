package com.technoelevate.springmvcproject.cont;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping(path ="/home")
	private String pu(Model model) {
		model.addAttribute("name","venkatesh");
		return "display.jsp";
 
	}
	@RequestMapping("homehggftrd")
	private String pu(ModelMap map) {
		map.addAttribute("name","venky");
		return "display.jsp";
	
	
	}
	
	@RequestMapping("home3")
	public ModelAndView name(ModelAndView view) {
		view.addObject("name","dhoni");
		view.setViewName("display.jsp");
		return view;
		
		
	}
	@RequestMapping("/login")
	public String login() {
		return "FORM.jsp";
		
	}
	
	
	
}
