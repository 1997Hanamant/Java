package com.xworkz.bags.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcrlUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection   =DriverManager.getConnection("jdbc:mysql://localhost:3306/rolex", "root", "Hanamant123@");
		System.out.println(connection);

		String updateSql ="update rolex.rolex_info set price='125000.00' where brandName='Rolex Sky-Dweller'";
		Statement statement=connection.createStatement();
		int rowsAffected=statement.executeUpdate(updateSql);
		System.out.println(rowsAffected);

		
		
	}

}
