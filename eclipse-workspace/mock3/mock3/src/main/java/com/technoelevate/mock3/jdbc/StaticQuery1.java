package com.technoelevate.mock3.jdbc;

import java.sql.*;

public class StaticQuery1 {

	public static void main(String[] args) throws SQLException {
    
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mock","root","7799");	
//	Statement statement=con.createStatement();
//	int set=statement.executeUpdate("insert into preparation values(110,'venkatesh')");
//	System.err.println(set+" affected");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mock","root","7799");
   PreparedStatement statement=con.prepareStatement("select * from preparation where id=?");
   statement.setInt(1, 100);
   ResultSet executeQuery = statement.executeQuery();
   while(executeQuery.next()) {
	   System.out.println(executeQuery.getInt(1));
   }
	}

}
