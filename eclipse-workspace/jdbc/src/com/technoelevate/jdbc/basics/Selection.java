package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Selection {
	public static void main(String[] args) throws SQLException {
		
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
			PreparedStatement prepareStatement = connection.prepareStatement("select * from emp where eid=?");
			Scanner scanner= new Scanner(System.in);
			System.out.println("enter eid value");
			String a= scanner.next();
			prepareStatement.setString(1,a);
			ResultSet executeUpdate = prepareStatement.executeQuery();
			
			while(executeUpdate.next()) {
				System.out.println(executeUpdate.getString(1)+executeUpdate.getString(2));
				
			}
			
			
			
			
		}
	}


