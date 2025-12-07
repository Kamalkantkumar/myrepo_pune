package com.technoelevate.salarypredictor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.technoelevate.salarypredictor.exception.MyException;

@ControllerAdvice
public class SalaryException {

	@ExceptionHandler(MyException.class)

	public String exception(HttpServletRequest request, MyException exception) {
		
		request.setAttribute("mess", exception.getMessage());
		
		return "";
		

	}

}
