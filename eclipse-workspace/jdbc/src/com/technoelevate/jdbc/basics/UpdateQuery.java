package com.technoelevate.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {

	static Connection connection = null;
	static PreparedStatement prepareStatement = null;
	static int executeUpdate = 0;
	static Scanner scan = new Scanner(System.in);

	public static void update() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "7799");
			System.out.println("connection succesful");
		} catch (SQLException e) {
			System.err.println("connection not succesful");
			e.printStackTrace();
		}
		try {
			prepareStatement = connection.prepareStatement("update emp set ename=? where eid=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("enter ename");
		String ename = scan.next();
		System.out.println("enter eid");
		String eid = scan.next();
		try {
			prepareStatement.setString(1, ename);
			prepareStatement.setString(2, eid);
			executeUpdate = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(executeUpdate + " query ok");

	}

	public static void insert() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "7799");
			System.out.println("connection succesful");
		} catch (SQLException e) {
			System.err.println("connection not succesful");
			e.printStackTrace();
		}
		try {
			prepareStatement = connection.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("enter eid");
		String eid = scan.next();
		System.out.println("enter ename");
		String ename = scan.next();
		System.out.println("enter desig");
		String desig = scan.next();
		System.out.println("enter sal");
		String sal = scan.next();
		System.out.println("enter age");
		String age = scan.next();
		System.out.println("enter hiredate");
		String hiredate = scan.next();

		try {
			prepareStatement.setString(1, eid);
			prepareStatement.setString(2, ename);
			prepareStatement.setString(3, desig);
			prepareStatement.setString(4, sal);
			prepareStatement.setString(5, age);
			prepareStatement.setString(6, hiredate);

			executeUpdate = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(" updated succesfully");

	}

	public static void delete() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "7799");
			System.out.println("connection succesful");
		} catch (SQLException e) {
			System.err.println("connection not succesful");
			e.printStackTrace();
		}
		try {
			prepareStatement = connection.prepareStatement("delete from emp where eid=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("enter eid");
		String eid = scan.next();
		try {
			prepareStatement.setString(1, eid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			executeUpdate = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("deleted succesfully");

	}

	private static void select() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "7799");
			prepareStatement = connection.prepareStatement("select * from emp where eid=?");
			System.out.println("enter eid");
			String eid = scan.next();
			prepareStatement.setString(1, eid);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString(1) + " " + executeQuery.getString(2) + " "
						+ executeQuery.getString(3) + " " + executeQuery.getString(4) + " " + executeQuery.getString(5)
						+ " " + executeQuery.getString(6));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	public static void main(String[] args) {
		boolean loop = true;
		while (loop) {
			System.out.println(
					"enter options\n❤press 1 to insert elements\n❤press 2 to update\n❤press 3 to delete\n❤press 4 to display");
			int a = scan.nextInt();
			if (a == 1) {
				System.err.println("insert into the table");
				insert();
			} else if (a == 2) {
				System.err.println("update the table");
				update();
			} else if (a == 3) {
				System.err.println("delete the records");
				delete();
			} else if (a == 4) {
				select();

			} else {
				loop = false;
				System.out.println("thank u");
			}

		}

	}
	}

