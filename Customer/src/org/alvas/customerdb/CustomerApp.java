package org.alvas.customerdb;

import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CustomerDao dao = new CustomerDao();
		Customer customer2 = new Customer();
		System.out.println("cus id");
		customer2.id = scanner.nextInt();
		System.out.println("cus name");
		customer2.name = scanner.next();
		System.out.println("cus phone");
		customer2.phone = scanner.next();
		
		
		if(customer2 != null)
			
		{
			System.out.println("data stored");
			
		}
		else {
			System.out.println("plese check your data");
		}
		

	}

}
