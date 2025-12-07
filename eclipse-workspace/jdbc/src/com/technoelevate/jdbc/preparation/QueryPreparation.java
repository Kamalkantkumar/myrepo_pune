package com.technoelevate.jdbc.preparation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class QueryPreparation {

	public static void main(String[] args) {
		FileReader pr = null;
		try {
			pr = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\jdbc\\resources\\new.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	Properties properties=new Properties();
	try {
		properties.load(pr);
	} catch (IOException e1) {
		e1.printStackTrace();
	}
     try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", properties);
		Statement statement = connection.prepareStatement(" select * from emp where eid=?");
		//statement.
		
	
		//while (query.next()) {
		//	System.out.println(query.getInt(1)+"  "+query.getString(2));
			
		//}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		
	}

}
