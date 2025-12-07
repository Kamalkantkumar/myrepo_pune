package com.technoelevate.jdbcpractice.propertyfiles;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			FileReader fileReader = new FileReader("db_info.properties");

			Properties properties = new Properties();

			properties.load(fileReader);

			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");

			connection = DriverManager.getConnection(properties.getProperty("url"), properties);
			System.out.println("Connection established");

			/*
			 * preparedStatement =
			 * connection.prepareStatement("select * from emp_data where emp_id=?"); String
			 * query = "update emp set ename=? where eid=?"
			 */;

			preparedStatement = connection.prepareStatement("update emp set ename=? where eid=?");
			preparedStatement.setInt(2, Integer.parseInt( properties.getProperty("eid")));
			preparedStatement.setString(1, properties.getProperty("ename"));

			int resultSet = preparedStatement.executeUpdate();
			/*
			 * while (resultSet.next()) { System.out .println(resultSet.getInt(1) + " | " +
			 * resultSet.getString(2) + " | " + resultSet.getString(3)); }
			 */

		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
//				if (resultSet!=null) {
//					try {
//						resultSet.close();
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
		}
	}
}
