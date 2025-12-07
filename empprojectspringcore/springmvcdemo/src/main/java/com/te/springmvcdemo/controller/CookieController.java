package com.te.springmvcdemo.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/cookie")
public class CookieController {
	@GetMapping("/getCookie")
	public String getPage()
	{
		return "cookiePage";
	}
	@GetMapping("/create")
	public String createCookie(HttpServletResponse response,ModelMap map) {
		Cookie cookie=new Cookie("empName","Daya");
		response.addCookie(cookie);
		
		map.addAttribute("msg","Cookie created successfully");
		return "cookiePage";
	}
}
