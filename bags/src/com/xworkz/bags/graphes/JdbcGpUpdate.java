package com.xworkz.bags.graphes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGpUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/graphes", "root", "Hanamant123@");
		System.out.println(connection);

		String updateSql="update  graphes.graphes_info set price=160.00 where name='Kismis'";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(updateSql);
		System.out.println(noOfRowsAffected);
		
	}

}
