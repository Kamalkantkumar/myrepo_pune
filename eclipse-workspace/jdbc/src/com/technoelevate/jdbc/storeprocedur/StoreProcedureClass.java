package com.technoelevate.jdbc.storeprocedur;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

public class StoreProcedureClass {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add(10);
		set.add("50");
		for (Object object : set) {
			System.out.println(object);
			
		}
		
//        Connection connection;
//        CallableStatement callableStatement;
//        ResultSet resultSet;
//        
//        
//        try {
//			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company?user=root&password=7799");
//			
//			callableStatement=connection.prepareCall("call abc(?,?)");
//			callableStatement.setInt(1, 2);
//			resultSet=callableStatement.executeQuery();
//			
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt(1));
//			}
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        
	}

}
