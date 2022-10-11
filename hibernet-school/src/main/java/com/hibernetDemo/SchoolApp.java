package com.hibernetDemo;

import java.util.Scanner;



public class SchoolApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SchoolDao dao = new SchoolDao();
		School school2 = new School();
		System.out.println("id");
		school2.id = scanner.nextInt();
		System.out.println("name");
		school2.name = scanner.next();
		System.out.println("subname");
		school2.subname = scanner.next();
		
		
		if(school2 != null)
			
		{
			System.out.println("data stored");
			
		}
		else {
			System.out.println("plese check your data");
		}

	}

}
