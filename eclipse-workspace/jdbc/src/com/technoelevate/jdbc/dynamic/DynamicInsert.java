package com.technoelevate.jdbc.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {

	public static void main(String[] args) {
     Connection connection=null;
     PreparedStatement preparedStatement=null;
     
     
     try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=7799");
		System.err.println("connection succesful");
		
		preparedStatement=connection.prepareStatement("insert into emp values( ?,?,?,?,?,?)");
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter eid :");
		int eid=scanner.nextInt();
		System.out.print("enter ename :");
		String ename=scanner.next();
		System.out.print("enter designation :");
		String desig=scanner.next();
		System.out.print("enter salary :");
		int sal=scanner.nextInt();
		System.out.print("enter age :");
		int age =scanner.nextInt();
		System.out.println("enter hiredate :");
		String hiredate=scanner.next();
		
		
		preparedStatement.setInt(1, eid);
		preparedStatement.setString(2,ename);
		preparedStatement.setString(3, desig);
		preparedStatement.setInt(4, sal);
		preparedStatement.setInt(5, age);
		preparedStatement.setString(6, hiredate);
		
		int result=preparedStatement.executeUpdate();
		System.out.println("succesful");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
