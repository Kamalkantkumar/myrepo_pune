package com.technoelevate.mock3.jdbc;

import java.sql.*;

public class StaticQuery {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
			Statement createStatement = con.createStatement();
			
		PreparedStatement  preparedStatement = con.prepareStatement("");
		preparedStatement.setString(0, null);
		ResultSet executeQuery2 = preparedStatement.executeQuery();
			int executeQuery = createStatement.executeUpdate("update emp set ename='balla' where eid=10");
//			while(executeQuery.next()) {
//				System.out.println(executeQuery.getString(1)); 
			
//			}
			System.out.println(executeQuery+" affected");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}

