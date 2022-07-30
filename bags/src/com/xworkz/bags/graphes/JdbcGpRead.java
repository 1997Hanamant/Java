package com.xworkz.bags.graphes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcGpRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(), DBProperties.PASSWORD.getValue());
		System.out.println(connection);

		String Sql = "SELECT * FROM graphes.graphes_info";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(Sql);

		AtomicInteger auto = new AtomicInteger();
		while (resultSet.next()) {
			auto.incrementAndGet();
			int pid = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String color = resultSet.getString(3);
			double price = resultSet.getDouble(4);
			String vitamin = resultSet.getString(5);
			System.out.println(pid + " " + name + " " + color + " " + price + " " + vitamin);
		}
		System.out.println(auto.get());
	}

}
