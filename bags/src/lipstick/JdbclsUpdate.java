package lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbclsUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(DBLipstickProperties.URL.getValue(),DBLipstickProperties.USERNME.getValue(),DBLipstickProperties.PASSWORD.getValue());
		System.out.println(connection);	

		String update="update lipstick.lipstick_info set brandName='Lotus Herbals' where price='450.00'";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(update);
		System.out.println(noOfRowsAffected);
	}

}
