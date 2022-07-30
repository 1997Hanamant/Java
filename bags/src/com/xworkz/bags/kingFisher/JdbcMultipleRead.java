package com.xworkz.bags.kingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcMultipleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBKingFisherProperties.URL.getValue(),
				DBKingFisherProperties.USERNME.getValue(), DBKingFisherProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "SELECT * FROM kingfisher.kingfisher_info";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		AtomicInteger auto=new AtomicInteger();
		while(resultSet.next()) {
			auto.incrementAndGet();
		int id = resultSet.getInt(1);
		String brandName = resultSet.getString(2);
		String price = resultSet.getString(3);
		String qunatity = resultSet.getString(4);
		String alcohalByVolume = resultSet.getString(5);
		System.out.println(id + " " + brandName + " " + price + " " + qunatity + " " + alcohalByVolume);
	}
		System.out.println(auto.get());
	}
}
