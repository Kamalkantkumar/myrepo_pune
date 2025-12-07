package com.te.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.springmvcdemo.dto.Employee;
import com.te.springmvcdemo.excepption.EmployeeException;

@ControllerAdvice
public class EmployeeExceptionController {
	@ExceptionHandler
	public String get(HttpServletRequest request,EmployeeException emp)
	{
			request.setAttribute("error",emp.getMessage());
			return "login";
	}
}
