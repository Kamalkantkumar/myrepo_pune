package com.te.employeeform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.te.employeeform.model.Employee;

public class EmployeeDao {

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String Insert = "INSERT INTO employee"
				+ "(empId,firstName,lastName,age,mobileNo,hno,city,state,pincode,hno1,city1,state1,pincode1)VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?,?,?);";

		int result = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ebixcash?user=root&password=root");

			PreparedStatement statement = connection.prepareStatement(Insert);
			statement.setString(1, employee.getEmpId());
			statement.setString(2, employee.getFirstName());
			statement.setString(3, employee.getLastName());
			statement.setString(4, employee.getAge());
			statement.setString(5, employee.getMobileNo());
			// For Current Address
			statement.setString(6, employee.getHno());
			statement.setString(7, employee.getCity());
			statement.setString(8, employee.getState());
			statement.setString(9, employee.getPincode());

			// For Permanent Address
			statement.setString(10, employee.getHno1());
			statement.setString(11, employee.getCity1());
			statement.setString(12, employee.getState1());
			statement.setString(13, employee.getPincode1());

			System.out.println(statement);
			result = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// for delete Employee

	public boolean deleteUser(String empId) throws SQLException {
		boolean rowDeleted = false;
		String delete = "delete from employee where empId=?;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ebixcash?user=root&password=root");
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setString(1, empId);
			rowDeleted = statement.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}

	// for update Employee

	public boolean updateUser(Employee employee) throws SQLException {
		boolean rowUpdated = false;
		String update = "update employee set firstName=?,lastName=?, age=?,mobileNo=?,hno=?,city=?,state=?,pincode=?,hno1=?,city1=?,state1=?,pincode1=? where empId=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ebixcash?user=root&password=root");
			PreparedStatement statement = connection.prepareStatement(update);

			statement.setString(1, employee.getFirstName());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getAge());
			statement.setString(4, employee.getMobileNo());

			// For Current Address
			statement.setString(5, employee.getHno());
			statement.setString(6, employee.getCity());
			statement.setString(7, employee.getState());
			statement.setString(8, employee.getPincode());

			// For Permanent Address
			statement.setString(9, employee.getHno1());
			statement.setString(10, employee.getCity1());
			statement.setString(11, employee.getState1());
			statement.setString(12, employee.getPincode1());
			statement.setString(13, employee.getEmpId());

			rowUpdated = statement.executeUpdate() > 0;
			System.out.println(statement);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

}
