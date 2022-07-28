package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDataBaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection	=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Hanamant123@");
		System.out.println(connection);
	}

	
}
