package com.xworkz.bags.graphes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcGpInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(), DBProperties.PASSWORD.getValue());
		System.out.println(connection);

		String insertSql = "insert into graphes.graphes_info values (10,'purpleGraphes','Purple',200.00,'B')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insertSql);
		System.out.println(noOfRowsAffected);
	}

}
