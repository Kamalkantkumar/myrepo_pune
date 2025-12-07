package com.technoelevate.mock3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicQuery {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
		PreparedStatement pre=con.prepareStatement("select * from emp where eid=?");
		pre.setInt(1, 10);
		ResultSet i=pre.executeQuery();
	while(i.next()) {
		System.out.println(i.getInt(1));
		
	}
	}

}
