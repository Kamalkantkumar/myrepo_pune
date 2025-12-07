package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticInsert {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1. Load the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2. Get connections
			String dburl = "jdbc:mysql://localhost:3306/company?user=root&password=bugger-master-key";
			connection = DriverManager.getConnection(dburl);

			// Step 3. Issue Sql Query
			String query = "insert into emp_data values(11, 'Sharath Raj', 'silent killer',26785,'2021-10-22',22, 'Bangalore')";
			statement = connection.createStatement();

			// Step 4. Process the result
			int result = statement.executeUpdate(query);
			if (result != 0) {
				System.out.println(result + " rows affected");
			}

		} catch (ClassNotFoundException | SQLException e) {
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