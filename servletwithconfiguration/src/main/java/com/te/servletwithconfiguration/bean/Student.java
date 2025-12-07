package com.te.servletwithconfiguration.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//out.print("<h1>hello</h1>");
	String name=request.getParameter("name");
	String password=request.getParameter("password");
//	out.print(name+"   "+password);
	//for display on jsp page
	//Student student=new Student();
	
	RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
	rd.forward(request, response);
			
	}
	
	
}
