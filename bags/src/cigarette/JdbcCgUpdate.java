package cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCgUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cigarette", "root", "Hanamant123@");
		System.out.println(connection);

		String updateSql="update cigarette.cigarette_info set price=10.00 where brandName='Cabin'";
		Statement statement=connection.createStatement();
		int noOfRowsAffected=statement.executeUpdate(updateSql);
		System.out.println(noOfRowsAffected);

	}

}
