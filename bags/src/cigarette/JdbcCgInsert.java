package cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCgInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBCigaretteProperties.URL.getValue(),
				DBCigaretteProperties.USERNME.getValue(), DBCigaretteProperties.PASSWORD.getValue());
		System.out.println(connection);

		String insert = "insert into  cigarette.cigarette_info values(10,'Four Squar',15.00,'white','720gm')";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(insert);
		System.out.println(noOfRowsAffected);

	}

}
