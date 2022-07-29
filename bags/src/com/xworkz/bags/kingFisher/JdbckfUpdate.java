package com.xworkz.bags.kingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbckfUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ kingfisher","root", "Hanamant123@");
		System.out.println(connection);

		String update="update  kingfisher.kingfisher_info set alcohalByVolume='Cannon' where brandName='kingfisherStrom'";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);
	}

}
