package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateResource {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter eid");
	int eid=scanner.nextInt();
	System.out.println("enter the date");
	String date=scanner.next();
	System.out.println("date in String format"+date);
	try {
		Date date2=new SimpleDateFormat("dd.mm.yy").parse(date);
		System.out.println("date in util format "+date2);
		java.sql.Date date3=new java.sql.Date(date2.getTime());
		
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=7799");
		
		statement=connection.createStatement();
		int result=statement.executeUpdate("update emp set hiredate='"+date3+"' where eid="+eid);
		
		
		
		
	} catch (ParseException | SQLException e) {
		e.printStackTrace();
	}
}
}
