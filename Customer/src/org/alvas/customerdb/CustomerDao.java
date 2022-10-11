package org.alvas.customerdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import customerconnection.CustomerConnection;


public class CustomerDao {

Connection con;
		public Customer savaCustomer(Customer customer) throws ClassNotFoundException {
			
			con = CustomerConnection.getConnection();
			String insert = "insert into cus values(?,?,?)";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, customer.id);
				ps.setString(2,customer.name);
				ps.setString(3, customer.phone);
				ps.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return customer;
		}
public Customer updateCustomer(Customer customer) throws ClassNotFoundException {
			
			con = CustomerConnection.getConnection();
			String insert = "update cus set name =?,phone= ? where id =?";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(3, customer.id);
				ps.setString(1,customer.name);
				ps.setString(2, customer.phone);
				
				

				ps.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return customer;
		}
public void getAllCustomer() throws SQLException, ClassNotFoundException{
	con = CustomerConnection.getConnection();
	String insert  ="SELECT * FROM cus";
	PreparedStatement ps = con.prepareStatement("insert");
	
	 ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));

	}
	}
public void deleteCustomerById(int id) throws ClassNotFoundException {
	con = CustomerConnection.getConnection();
	String insert = "delete from cus where id = ?";
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
