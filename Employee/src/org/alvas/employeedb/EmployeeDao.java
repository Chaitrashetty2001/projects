package org.alvas.employeedb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employeeconnection.EmployeeConnection;

public class EmployeeDao {

Connection con;
		public Employee savaEmployee(Employee employee) throws ClassNotFoundException {
			
			con = EmployeeConnection.getConnection();
			String insert = "insert into emp values(?,?,?,?)";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, employee.id);
				ps.setString(2,employee.name);
				ps.setString(3, employee.email);
				ps.setDouble(4, employee.salary);
				ps.execute();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return employee;
		}
public Employee updateEmployee(Employee employee) throws ClassNotFoundException {
			
			con = EmployeeConnection.getConnection();
			String insert = "update emp set name =?,email= ? where id =?";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(3, employee.id);
				ps.setString(1,employee.name);
				ps.setString(2, employee.email);
				
				

				ps.execute();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return employee;
		}
public void getAllEmployee() throws SQLException, ClassNotFoundException{
	con = EmployeeConnection.getConnection();
	String insert  ="SELECT * FROM emp";
	PreparedStatement ps = con.prepareStatement("insert");
	
	 ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));
	System.out.println(rs.getString(4));
	}
	}
public void deleteEmployeeById(int id) throws ClassNotFoundException {
	con = EmployeeConnection.getConnection();
	String insert = "delete from emp where id = ?";
	try
	{
		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1,id);
		ps.executeUpdate();
		}
	catch(SQLException e){
		e.printStackTrace();
		
	}
	

	
}
}
