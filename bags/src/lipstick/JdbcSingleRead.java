package lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSingleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBLipstickProperties.URL.getValue(),
				DBLipstickProperties.USERNME.getValue(), DBLipstickProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="Select com.*from lipstick.lipstick_info as com where brandName='Elle '";
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(sql);
		//boolean result=resultSet.next();
		//System.out.println(result);
		if(resultSet.next()) {
			int id	=resultSet.getInt(1);
			String brandName=resultSet.getString(2);
			String color=resultSet.getString(3);
			double price=resultSet.getDouble(4);
			String size=resultSet.getString(5);
			System.out.println(id+" "+brandName+" "+color+" "+price+" "+size);
		}
		else {
			System.out.println("Table deatils not found");
		}
	}

}
