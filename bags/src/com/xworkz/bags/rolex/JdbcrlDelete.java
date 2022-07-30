package com.xworkz.bags.rolex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcrlDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBRolexProperties.URL.getValue(),
				DBRolexProperties.USERNME.getValue(), DBRolexProperties.PASSWORD.getValue());
		System.out.println(connection);

		String deleteSql = "delete from rolex.rolex_info where brandName='RolexSubmarinerAutomaticDailWatch'";
		Statement statement = connection.createStatement();
		int noOfRowsAffetced = statement.executeUpdate(deleteSql);
		System.out.println(noOfRowsAffetced);
	}

}
