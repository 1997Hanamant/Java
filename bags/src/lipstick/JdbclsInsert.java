package lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbclsInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBLipstickProperties.URL.getValue(),
				DBLipstickProperties.USERNME.getValue(), DBLipstickProperties.PASSWORD.getValue());
		System.out.println(connection);

		String insert = "insert into  lipstick.lipstick_info values(11,'Nyx','BrownShade',570.00,'Medium')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
