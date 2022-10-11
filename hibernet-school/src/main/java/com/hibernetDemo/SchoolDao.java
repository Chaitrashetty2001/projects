package com.hibernetDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import schoolconnection.SchoolConnection;


public class SchoolDao {

	public static void main(String[] args) {
		Connection con;
		School saveSchool(School school) throws ClassNotFoundException {
			
			con = SchoolConnection.getConnection();
			String insert = "insert into teacher values(?,?,?)";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(1, school.id);
				ps.setString(2,school.name);
				ps.setString(3, school.subname);
				ps.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return school;
		}
public School updateSchool(School school) throws ClassNotFoundException {
			
			con = SchoolConnection.getConnection();
			String insert = "update teacher set name =?,subname= ? where id =?";
			try
			{
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setInt(3, school.id);
				ps.setString(1,school.name);
				ps.setString(2, school.subname);
				
				

				ps.executeUpdate();
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			return school;
		}
public void getAllSchool() throws SQLException, ClassNotFoundException{
	con = SchoolConnection.getConnection();
	String insert  ="SELECT * FROM teacher";
	PreparedStatement ps = con.prepareStatement("insert");
	
	 ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));

	}
	}
public void deleteSchoolById(int id) throws ClassNotFoundException {
	con = SchoolConnection.getConnection();
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

}
