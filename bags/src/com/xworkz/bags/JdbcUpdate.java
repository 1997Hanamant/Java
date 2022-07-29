package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection   =DriverManager.getConnection("jdbc:mysql://localhost:3306/perfume", "root", "Hanamant123@");
		System.out.println(connection);

		String update ="update perfume.company_info set price='400' where Fragancnce='jasmine'";
		Statement statement=connection.createStatement();
		int rowsAffected=statement.executeUpdate(update);
		System.out.println(rowsAffected);

	}

}
