package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDataBaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBBagproperties.URL.getValue(),
				DBBagproperties.USERNAME.getValue(), DBBagproperties.PASSWORD.getValue());
		System.out.println(connection);

		String insert = "Insert into  perfume.company_info values(2 ,'Due','perfume','250','Chocalate')";
		Statement statement = connection.createStatement();
		int rowsAffected = statement.executeUpdate(insert);
		System.out.println(rowsAffected);

	}

}
