package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletequery {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1. Load the drivers
			//Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2. Get connections
			String dburl = "jdbc:mysql://localhost:3306/company?user=root&password=7799";//jdbc:mysql://localhost:3306/company
			connection = DriverManager.getConnection(dburl);
			System.out.println("connection sucess");
			
			// Step 3. Issue Sql Query
			String query = "delete from emp where eid=52";
			statement = connection.createStatement();

			// Step 4. Process the result
			int result = statement.executeUpdate(query);
			if (result != 0) {
				System.out.println(result + " rows affected");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Step 5. Close all connections
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
