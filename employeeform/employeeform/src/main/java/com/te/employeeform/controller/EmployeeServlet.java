package com.te.employeeform.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.RequestDumperFilter;

import com.te.employeeform.dao.EmployeeDao;
import com.te.employeeform.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao = new EmployeeDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeform.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String mobileNo = request.getParameter("mobileNo");
		// For Current Address
		String hno = request.getParameter("hno");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String pincode = request.getParameter("pincode");
		// For Permanent Address
		String hno1 = request.getParameter("hno1");
		String city1 = request.getParameter("city1");
		String state1 = request.getParameter("state1");
		String pincode1 = request.getParameter("pincode1");

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(Integer.parseInt(age));
		employee.setMobileNo(Integer.parseInt(mobileNo));

		employee.setHno(hno);
		employee.setCity(city);
		employee.setState(state);
		employee.setPincode(pincode);

		employee.setHno1(hno1);
		employee.setCity1(city1);
		employee.setState1(state1);
		employee.setPincode1(pincode1);

		try {
			employeeDao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
//		dispatcher.forward(request, response);

	}

}
