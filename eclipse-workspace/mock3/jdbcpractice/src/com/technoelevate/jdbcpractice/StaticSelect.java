package com.technoelevate.jdbcpractice;
import java.sql.*;

import com.mysql.cj.jdbc.Driver;
public class StaticSelect {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","7799");
}
