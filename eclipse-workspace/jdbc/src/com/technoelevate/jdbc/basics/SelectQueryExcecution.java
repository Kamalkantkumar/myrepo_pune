package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryExcecution {

	public static void main(String[] args) throws SQLException {
		
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
		Statement createStatement = connection.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("select * from emp");
		while(executeQuery.next()) {
			System.out.println(executeQuery.getString(1)); 
		}

	}

}
