package com.te.employeeform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.te.employeeform.model.Employee;

public class EmployeeDao {

	// JDBC Driver name and Database url
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1533:xe";

	// DataBase Credentials

	static final String USERNAME = "INDUS_ASSIGNMENTS";
	static final String PASSWORD = "INDUS_ASSIGNMENTS";

	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String Insert = "INSERT INTO employee"
				+ "(firstName,lastName,age,mobileNumber,hno,city,state,pincode,hno1,city1,state1,pincode1)VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?,?);";

		int result = 0;

		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

			PreparedStatement statement = connection.prepareStatement(Insert);
			statement.setString(1, employee.getFirstName());
			statement.setString(2, employee.getLastName());
			statement.setInt(3, employee.getAge());
			statement.setInt(4, employee.getMobileNo());
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

			System.out.println(statement);
			result = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
