package com.hibernetDemo;

import java.util.Scanner;



public class SchoolApp2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
SchoolDao dao = new SchoolDao();
School school  = new School();
		System.out.println(" id");
		school.id = scanner.nextInt();
		System.out.println("name");
		school.name= scanner.next();
		System.out.println("subname");
		school.subname = scanner.next();

		 School school2 = dao.saveSchool(school);
		if(school2 != null)
			
		{
			System.out.println("data stored");
			
		}
		
		else 
		{
			System.out.println("pleese check your data");
		}
		

	}


	



	}


