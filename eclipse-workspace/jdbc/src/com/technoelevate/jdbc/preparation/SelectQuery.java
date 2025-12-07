package com.technoelevate.jdbc.preparation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String[] args) {
		Connection connection=null;
		ResultSet executeQuery=null;
		Statement statement=null;

		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
			System.out.println("connection succesful");
		}catch (SQLException e) {
			e.printStackTrace();
			System.err.println("connection not succesful");
		}
			
			try {
				statement = connection.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
			 executeQuery = statement.executeQuery("select * from emp");
			System.out.println("Query not ok");
			}catch (Exception e) {
				
				System.out.println("query not ok");
			}
			
			int int1;
			try {
				int1 = executeQuery.getInt(1);
				System.out.println(int1);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			
			
			
		} 
	}
	
	
	


