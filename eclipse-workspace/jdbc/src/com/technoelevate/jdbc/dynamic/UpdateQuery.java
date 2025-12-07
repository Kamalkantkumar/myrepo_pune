package com.technoelevate.jdbc.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateQuery {
	public static void main(String[] args) {
		Connection connection;
		PreparedStatement preparedStatement;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=7799");
			System.out.println("connection succesful");

			preparedStatement = connection.prepareStatement("update emp set ename=? where eid=?");
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter eid :");
			int eid = scanner.nextInt();
			System.out.println("enter ename :");
			String ename = scanner.next();

			preparedStatement.setInt(2, eid);
			preparedStatement.setString(1, ename);
			preparedStatement.executeUpdate();
			preparedStatement.execute();
			System.err.println("query succesful");
//		

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
