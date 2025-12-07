package com.te.employeeform.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.employeeform.dao.EmployeeDao;
import com.te.employeeform.model.Employee;

@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao = new EmployeeDao();

	public EmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String action = request.getServletPath();
		switch (action) {

		case "/add":
			insertUser(request, response);
			break;

		case "/delete":
			deleteUser(request, response);
			break;

		case "/update":
			updateUser(request, response);
			break;

		case "/fetch":
			fetchUser(request, response);
			break;

		default:
			break;
		}
	}

	// for insert

	private void insertUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeform.jsp");
		dispatcher.forward(request, response);
	}

	// for delete User

	private void deleteUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/deleteForm.jsp");
		dispatcher.include(request, response);

		String empId = request.getParameter("empId");

		try {
			boolean employee = employeeDao.deleteUser(empId);
			if (employee == true) {
				RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/views/deletemessage.jsp");
				dispatcher1.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// for update User

	private void updateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/updateForm.jsp");
		dispatcher.include(request, response);

		String empId = request.getParameter("empId");
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

		Employee employee = new Employee(empId, firstName, lastName, age, mobileNo, hno, city, state, pincode, hno1,
				city1, state1, pincode1);
		System.out.println("update1 " + employee.toString());

		try {
			employeeDao.updateUser(employee);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (employee.getEmpId() != null) {
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/views/updateddetails.jsp");
			dispatcher1.forward(request, response);
		}
	}

	// for fetch All Record From Data Base

	private void fetchUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ebixcash?user=root&password=root");
			PreparedStatement statement = connection.prepareStatement("select * from employee");
			ResultSet rs = statement.executeQuery();
			PrintWriter out = response.getWriter();
			out.println(
					"<html><body style='color:yellow; margin-left:20px;'><table style='margin-top:20px; width:100%;' border='1' height='2'><tr><th style='display;flex;background:mediumblue;color:white;'>Id</th><th style='display;flex;background:mediumblue;color:white;'>empId</th><th style='display;flex;background:mediumblue;color:white;'>firstName</th><th style='display;flex;background:mediumblue;color:white;'>lastName</th><th style='display;flex;background:mediumblue;color:white;'>age</th><th style='display;flex;background:mediumblue;color:white;'>mobileNo</th><th style='display;flex;background:mediumblue;color:white;'>hno</th><th style='display;flex;background:mediumblue;color:white;'>city</th><th style='display;flex;background:mediumblue;color:white;'>state</th><th style='display;flex;background:mediumblue;color:white;'>pincode</th><th style='display;flex;background:mediumblue;color:white;'>hno</th><th style='display;flex;background:mediumblue;color:white;'>city</th><th style='display;flex;background:mediumblue;color:white;'>state</th><th style='display;flex;background:mediumblue;color:white;'>pincode</th></tr>");
			while (rs.next()) {
				out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6)
						+ "</td><td>" + rs.getString(7) + "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(9)
						+ "</td><td>" + rs.getString(10) + "</td><td>" + rs.getString(11) + "</td><td>"
						+ rs.getString(12) + "</td><td>" + rs.getString(13) + "</td><td>" + rs.getString(14)
						+ "</td></tr>");
			}
			out.println("</table></body></html>");
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WEB-INF/views/deleteForm.jsp");
			dispatcher1.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// For Inserting Data

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = request.getParameter("empId");

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
		if(hno1==null) {
			 hno1 = request.getParameter("hno");
		}
		
		String city1 = request.getParameter("city1");
		if(city1==null) {
			city1=request.getParameter("city");
		}
		
		String state1 = request.getParameter("state1");
		if(state1==null) {
			state1 = request.getParameter("state");
		}
		
		String pincode1 = request.getParameter("pincode1");
		if(pincode1==null) {
			pincode1 = request.getParameter("pincode");
		}

		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(age);
		employee.setMobileNo(mobileNo);

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

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);

	}

}
