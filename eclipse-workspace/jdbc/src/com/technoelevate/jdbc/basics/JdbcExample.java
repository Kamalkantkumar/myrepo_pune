package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExample {

	public static void main(String[] args) {
      try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
		//Statement createStatement = connection.createStatement();
		//ResultSet executeQuery = createStatement.executeQuery("select * from emp where eid>?");
	       PreparedStatement prepareStatement = connection.prepareStatement("delete from emp where eid=?");
	       System.err.println("enter eid");
	       Scanner scanner=new Scanner(System.in);
	       String eid=scanner.next();
//	       System.err.println("enter ename");
//	       String ename=scanner.next();
//	       System.err.println("enter desig");
//	       String desig=scanner.next();
//	       System.err.println("enter sal");
//	       String sal=scanner.next();
//	       System.err.println("enter age");
//	       String age=scanner.next();
//	       System.err.println("enter hiredate");
//	       String hiredate=scanner.next();
	       prepareStatement.setString(1, eid);
//	       prepareStatement.setString(2, ename);
//	       prepareStatement.setString(3, desig);
//	       prepareStatement.setString(4, sal);
//	       prepareStatement.setString(5, age);
	      // prepareStatement.setString(1, hiredate);
	       
	       
	     
	       
	       
	       int executeQuery = prepareStatement.executeUpdate();
	       System.out.println(executeQuery+" query ok");
	       
	     
//	       
//		while (executeQuery.next()) {
//			System.out.println(executeQuery.getString(1)+"  "+executeQuery.getString(2)+"  "+executeQuery.getString(3)+"  "+executeQuery.getString(4));
//		}
		
		
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
	}
	}

}
