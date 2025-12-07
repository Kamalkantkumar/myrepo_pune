package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) {
		List<EmployeeClass> classes=new ArrayList<EmployeeClass>();
		
          Connection connection = null;
          ResultSet set = null;
          Statement statement = null;
          
          try {
        	 // DriverManager driverManager=new Dri
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
			System.out.println("connection sucessful");
			
			statement=connection.createStatement();
			
			set=statement.executeQuery("select * from emp where eid>100 ");
			System.out.println("rows affected");
			while(set.next()) {
				EmployeeClass class1=new EmployeeClass();
				class1.setEid(set.getInt(1));
				class1.setEname(set.getString(2));
				class1.setDesig(set.getString(3));
				class1.setSal(set.getInt(4));
				class1.setAge(set.getInt(5));
				classes.add(class1);
			}
			for (EmployeeClass employeeClass : classes) {
				System.out.println(employeeClass);
			}
		
          
          
          
          } catch (SQLException e) {
			System.err.println("connection unsuccesful");
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				set.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
