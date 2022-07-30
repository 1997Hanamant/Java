package cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCgDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBCigaretteProperties.URL.getValue(),
				DBCigaretteProperties.USERNME.getValue(), DBCigaretteProperties.PASSWORD.getValue());
		System.out.println(connection);

		String delete = "delet from cigarette.cigarette_info where brandName='Bristol'";
		Statement statement = connection.createStatement();
		int noOfRowsAffected = statement.executeUpdate(delete);
		System.out.println(noOfRowsAffected);

	}

}
