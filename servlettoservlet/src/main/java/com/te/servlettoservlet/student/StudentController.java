package com.te.servlettoservlet.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/student")
public class StudentController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
//		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("total_value", "sucessfull");
		
		RequestDispatcher rd=req.getRequestDispatcher("/final");
		rd.forward(req, resp);
	}
}

