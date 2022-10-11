package schoolconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SchoolConnection {

	public static Connection main(String[] args) throws ClassNotFoundException {
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "root";
			try {
				Connection con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

	}

}
