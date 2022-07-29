package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection	=DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root","Hanamant123@" );
		System.out.println(connection);

		String delete="Delete From perfume.company_info where price='400'";
		Statement statement=connection.createStatement();
		int rowsAffected=statement.executeUpdate(delete);
		System.out.println(rowsAffected);


	}

}