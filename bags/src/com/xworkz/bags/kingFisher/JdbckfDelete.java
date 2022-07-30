package com.xworkz.bags.kingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbckfDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBKingFisherProperties.URL.getValue(),
				DBKingFisherProperties.USERNME.getValue(), DBKingFisherProperties.PASSWORD.getValue());
		System.out.println(connection);

		String delete = "delete from  kingfisher.kingfisher_info where brandName='Cannon'";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);
	}
}
