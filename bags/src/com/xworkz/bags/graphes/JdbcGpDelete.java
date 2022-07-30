package com.xworkz.bags.graphes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGpDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(), DBProperties.PASSWORD.getValue());
		System.out.println(connection);

		String deleteSql = "delete from graphes.graphes_info where price=200";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(deleteSql);
		System.out.println(noOfRowsAffected);

	}

}
