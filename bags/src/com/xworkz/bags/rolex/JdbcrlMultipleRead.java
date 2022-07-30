package com.xworkz.bags.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcrlMultipleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBRolexProperties.URL.getValue(),
				DBRolexProperties.USERNME.getValue(), DBRolexProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="SELECT * FROM  rolex.rolex_info";
		Statement statement = connection.createStatement();
		ResultSet resultSet	=statement.executeQuery(sql);
		AtomicInteger auto=new AtomicInteger();
		while(resultSet.next()) {
			auto.incrementAndGet();
			int id	=resultSet.getInt(1);
			String brandName=resultSet.getString(2);
			String price=resultSet.getString(3);
			String color=resultSet.getString(4);
			String waterproofness=resultSet.getString(5);
			System.out.println(id+" "+brandName+" "+price+" "+color+" "+waterproofness);
		}
			System.out.println(auto.get());
		}
	}
