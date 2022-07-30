package com.xworkz.bags.graphes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSingleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBProperties.URL.getValue(),
				DBProperties.USERNAME.getValue(), DBProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="SELECT com.* FROM graphes.graphes_info as com where name='Kismis'";
		Statement statement=connection.createStatement();
		ResultSet resultSet	=statement.executeQuery(sql);
		boolean result=resultSet.next();
		System.out.println(result);
		int id	=resultSet.getInt(1);
		String name	=resultSet.getString(2);
		String color	=resultSet.getString(3);
		double price=resultSet.getDouble(4);
		String vitamin=resultSet.getString(5);
		System.out.println(id+" "+name+" "+color+" "+price+" "+vitamin);


	}
}