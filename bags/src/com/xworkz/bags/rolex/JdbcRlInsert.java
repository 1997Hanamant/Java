package com.xworkz.bags.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRlInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rolex", "root", "Hanamant123@");
		System.out.println(connection);

		String insertSql="insert into rolex.rolex_info values(10 ,'Rolex Oyster Perpetual Explorer I','Silver','13000.00','yes')";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(insertSql);
		System.out.println(noOfRowsAffected);
	}


}
