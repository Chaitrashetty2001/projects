package org.alvas.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	
	public static void main(String[] args) throws Exception
	{
	//load the driver
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "root";
		try
		{
		Connection connection;
		connection = DriverManager.getConnection(url,username,password);
		String insert = "insert into stud values(2,'neon')";
		
		Statement statement = connection.createStatement();
		
		boolean b = statement.execute(insert);
		if(b==true)
		{
			System.out.println("Data stored");
		}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	
}

}
