package com.technoelevate.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticQuery {
	public static void main(String[] args) {
		Connection connection=null;
		Statement createStatement=null;
		try {
			 connection=DriverManager.getConnection("jdbc:mysql://127.0.0.2:3306/prana","root","Anarp1@3");
			System.err.println("connection succesful");
		 createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("select * from admin");
			while(executeQuery.next()) {
				System.out.println(
						/* executeQuery.getString(1)+"  " */executeQuery.getString(2)+"  "+executeQuery.getString(3)+" "+executeQuery.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
			System.err.println("connection not succesful");
		}finally {
			try {
				if(connection!=null  ) {
					connection.close();
			
				}
				if(createStatement!=null) {
					createStatement.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	

}
