package com.xworkz.bags.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSingleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBRolexProperties.URL.getValue(),
				DBRolexProperties.USERNME.getValue(), DBRolexProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="SELECT com.* FROM  rolex.rolex_info as com where brandName=' Chand'";
		Statement statement = connection.createStatement();
		ResultSet resultSet	=statement.executeQuery(sql);
		//boolean result=resultSet.next();
		//System.out.println(result);
		if(resultSet.next()) {
	
		int id	=resultSet.getInt(1);
		String brandName=resultSet.getString(2);
		String price=resultSet.getString(3);
		String color=resultSet.getString(4);
		String waterproofness=resultSet.getString(5);
		System.out.println(id+" "+brandName+" "+price+" "+color+" "+waterproofness);
		}
		else {
			System.out.println("Table details not found");
		}
	}

}
