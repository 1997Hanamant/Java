package lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbclsDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBLipstickProperties.URL.getValue(),
				DBLipstickProperties.USERNME.getValue(), DBLipstickProperties.PASSWORD.getValue());
		System.out.println(connection);

		String delete = "delete from lipstick.lipstick_info  where price='570.00'";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}
}
