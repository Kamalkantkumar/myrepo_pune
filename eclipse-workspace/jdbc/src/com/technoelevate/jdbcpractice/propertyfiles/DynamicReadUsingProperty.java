package com.technoelevate.jdbcpractice.propertyfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicReadUsingProperty {
	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("db_info.properties");
			System.out.println("path found");
		} catch (FileNotFoundException e) {
			
			
			System.err.println("path not found");
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(fileReader);
			System.out.println("file loaded succesfully");
			
 			
		
			
		} catch (IOException e1) {
			System.out.println("file not found");
			e1.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties);
			
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from emp_data where emp_id=?");
			//ResultSet resultSet=

			//System.err.println("connection establishment");
		} catch (SQLException e) {
			System.out.println("connection fail");
			e.printStackTrace();
		}

	}

}
