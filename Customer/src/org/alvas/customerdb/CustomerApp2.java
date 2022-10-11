package org.alvas.customerdb;

import java.util.Scanner;

public class CustomerApp2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		CustomerDao dao = new CustomerDao();
		Customer customer  = new Customer();
		System.out.println("emp id");
		 customer.id = scanner.nextInt();
		System.out.println("emp name");
		 customer.name= scanner.next();
		System.out.println("emp phone");
		 customer.phone = scanner.next();

		Customer customer2 = dao.savaCustomer(customer);
		if(customer2 != null)
			
		{
			System.out.println("data stored");
			
		}
		
		else 
		{
			System.out.println("pleese check your data");
		}
		

	}


	}


