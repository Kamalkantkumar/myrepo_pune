package com.technoelevate.remock;

import java.sql.*;


import com.mysql.cj.xdevapi.Statement;

public class Persons {

	public static void main(String[] args) {
      
	  try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
		java.sql.Statement statement=con.createStatement();
		ResultSet executeQuery = statement.executeQuery("select * from employ");
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt(1)+" "+executeQuery.getString(2));
		}
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
		
	}

}
