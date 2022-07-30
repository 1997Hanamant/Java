package com.xworkz.bags.kingFisher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcKfInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBKingFisherProperties.URL.getValue(),
				DBKingFisherProperties.USERNME.getValue(), DBKingFisherProperties.PASSWORD.getValue());
		System.out.println(connection);
		String insert = "insert into  kingfisher.kingfisher_info values(10,'Bullet ','150','200ml','4.7%')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
