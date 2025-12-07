package com.te.practicejspkamal;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LearningJSP
 */
@WebServlet("/LearningJSP")
public class LearningJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LearningJSP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		response.setContentType("text/html");
		
		

		PrintWriter writer = response.getWriter();

		/*
		 * The method (doPost or doGet based on metod set in jsp page inside form
		 * opening tag i.e method = "post") normally receives the request and response
		 * objects, we then call the .getWriter() method for the response obj that gets
		 * us the stream on which we can write our output.
		 * 
		 * response.getWriter() returns a PrintWriter object that can send character
		 * text to the client(i.e Browser of User).
		 * 
		 * res.getWriter(); returns the object of PrintWriter Class, in which
		 * print(String args) method is declared to print anything on the browser's page
		 * as a response.
		 * 
		 * 
		 */

		  Enumeration<String> list  = request.getParameterNames();
		 

		/*
		 * Returns an Enumeration of String objects containing the names of the
		 * parameters contained in this request.
		 * 
		 * getParameter() -->method to get the value of a form parameter.
		 * 
		 * getParameterValues() − Call this method if the parameter appears more than
		 * once and returns multiple values, for example checkbox.
		 * 
		 * getParameterNames() − Call this method if you want a complete list of all
		 * parameters in the current request.
		 * 
		 * Basically getParameterNames() gives us the list of all the parameters (in the
		 * form of Enumeration) present inside the request using the getParameter()
		 * method.
		 */
		  
		  
		  while(list.hasMoreElements()) {
			  
			   String elements=list.nextElement() ; //the next element of this enumeration.
			  writer.println(request.getParameter(elements));
			  
			  
		  }

	}

}
