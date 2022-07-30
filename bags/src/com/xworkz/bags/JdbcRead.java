package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBBagproperties.URL.getValue(),
				DBBagproperties.USERNAME.getValue(), DBBagproperties.PASSWORD.getValue());

		String sql = "SELECT com.* FROM perfume.company_info as com where type='choclate,'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		boolean result = resultSet.next();
		System.out.println(result);
		if (result) {

			int pid = resultSet.getInt("pid");
			System.out.println(pid);
			String companyName = resultSet.getString("CompanyName");
			System.out.println(companyName);
			String type = resultSet.getString("Type");
			String price = resultSet.getString("price");
			System.out.println(price);
			String fragranance = resultSet.getString(5);
			System.out.println(fragranance);
		} else {
			System.out.println("Table details is not found");
		}

	}

}
