package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcMultipleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBBagproperties.URL.getValue(),
				DBBagproperties.USERNAME.getValue(), DBBagproperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="Select * From perfume.company_info";
		Statement statement=connection.createStatement();
		ResultSet resultSet =statement.executeQuery(sql);
		AtomicInteger auto=new AtomicInteger();
		while(resultSet.next()) {
			auto.incrementAndGet();
			int	pid = resultSet.getInt(1);
			//System.out.println("pid");
			String copmanyName=resultSet.getString(2);
			//System.out.println(copmanyName);
			String type=resultSet.getString(3);
			//System.out.println(type);
			String price=resultSet.getString(4);
			//System.out.println(price);
			String fragrance=resultSet.getString(5);
			//System.out.println(fragrance);
			System.out.println(pid+" "+copmanyName+""+type+" "+price+" "+fragrance);
			}
		System.out.println(auto.get());
	}

}
