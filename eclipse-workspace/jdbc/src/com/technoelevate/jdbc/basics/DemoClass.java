package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoClass {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet set = null;
		Statement statement = null;

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} // step :load the driver
			System.out.println("driver loaded succesfully");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "7799");// step
																										// 2:api,vendor
																										// name,ipadress,database
			       																					    // name//ge	                     																						// connection
			System.out.println("connection sucessful");
			
			String query = "select * from emp ";
         
			statement = con.createStatement();// step 3
			
			set = statement.executeQuery(query);// step 4//issue sql query

			System.out.println("query excecuted sucessfully" + set);

			while (set.next()) {
				System.out.println(" " + set.getInt("eid") + " \n " + set.getString(2) + "\n " + set.getString(3)
						+ "\n " + set.getInt(4) + "\n " + set.getInt("AGE")
						+ "\n---------------------------------------------");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
