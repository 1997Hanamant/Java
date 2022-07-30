package com.xworkz.bags.kingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSignleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(DBKingFisherProperties.URL.getValue(), DBKingFisherProperties.USERNME.getValue(),DBKingFisherProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="SELECT com.* FROM kingfisher.kingfisher_info as com where brandName='Amster Bier'";
		Statement statement=connection.createStatement();
		ResultSet resultSet	=statement.executeQuery(sql);
		boolean result	=resultSet.next();
		System.out.println(result);

		int id=resultSet.getInt(1);
		String brandName=resultSet.getString(2);
		String price=resultSet.getString(3);
		String qunatity=resultSet.getString(4);
		String alcohalByVolume=resultSet.getString(5);
		System.out.println(id+" "+brandName+" "+price+" "+qunatity+" "+alcohalByVolume);
	}

}
