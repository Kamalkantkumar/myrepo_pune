package com.technoelevate.mock3.jdbc;

import java.sql.*;

public class Query1 {

	public static void main(String[] args) {

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
			PreparedStatement statement=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
			statement.setString(1,"110");
			statement.setString(2, "venky");
			statement.setString(3,"devops");
			statement.setString(4, "45652");
			statement.setString(5,"22");
			statement.setString(6, "2020-05-12");
			
			int executeQuery = statement.executeUpdate();
			
			System.out.println(executeQuery+" affectd");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
