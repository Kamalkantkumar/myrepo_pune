package com.te.servletusingannotation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student")
public class StudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
//		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		req.setAttribute("name", name);
		RequestDispatcher rd=req.getRequestDispatcher("details.jsp");
		rd.forward(req, resp);
	}
}
