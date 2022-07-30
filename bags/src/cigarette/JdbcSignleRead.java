package cigarette;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSignleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBCigaretteProperties.URL.getValue(),
				DBCigaretteProperties.USERNME.getValue(), DBCigaretteProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql = "Select com.* from cigarette.cigarette_info as com where brandName='Apache'";
		Statement statement = connection.createStatement();
		ResultSet resultSet	=statement.executeQuery(sql);
		boolean result	=resultSet.next();
		System.out.println(result);
		int id	=resultSet.getInt(1);
		String brandName= resultSet.getString(2);
		int price	=resultSet.getInt(3);
		String color=resultSet.getString(4);
		String tobaccoContent=resultSet.getString(5);
		System.out.println(id+" "+brandName+" "+price+" "+color+" "+tobaccoContent);

	}

}
