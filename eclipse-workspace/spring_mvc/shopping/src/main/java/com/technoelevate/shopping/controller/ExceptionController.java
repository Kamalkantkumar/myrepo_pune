package com.technoelevate.shopping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.technoelevate.shopping.exception.CustomException;
import com.technoelevate.shopping.exception.MyException;

@ControllerAdvice
public class ExceptionController {
	
	
	@ExceptionHandler(MyException.class)
	public String getException(HttpServletRequest request,MyException exception) {
		request.setAttribute("mess", exception.getMessage());
		return "login.jsp";	
	}
	
	   
     @ExceptionHandler(CustomException.class)
	public String getException1(HttpServletRequest request,CustomException exception1) {
		request.setAttribute("mess", exception1.getMessage());
		return "password.jsp";
		
	}

}
