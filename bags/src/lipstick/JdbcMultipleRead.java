package lipstick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class JdbcMultipleRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DBLipstickProperties.URL.getValue(),
				DBLipstickProperties.USERNME.getValue(), DBLipstickProperties.PASSWORD.getValue());
		System.out.println(connection);

		String sql="Select * from lipstick.lipstick_info ";
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(sql);
		//boolean result=resultSet.next();
		//System.out.println(result);
		AtomicInteger auto=new AtomicInteger();
		while(resultSet.next()) {
			auto.incrementAndGet();
			int id	=resultSet.getInt(1);
			String brandName=resultSet.getString(2);
			String color=resultSet.getString(3);
			double price=resultSet.getDouble(4);
			String size=resultSet.getString(5);
			System.out.println(id+" "+brandName+" "+color+" "+price+" "+size);
	}
		System.out.println(auto.get());

}
}