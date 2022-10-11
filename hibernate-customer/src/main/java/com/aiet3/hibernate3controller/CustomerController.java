package com.aiet3.hibernate3controller;

import java.util.Scanner;

import com.aiet3.hibernate3.dao.CustomerDao;
import com.aiet3.hibernate3.dto.Customer;

public class CustomerController {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Customer customer;
	CustomerDao customerDao = new CustomerDao();
	while(true)
	{
		System.out.println("1.SaveCustomer");
		System.out.println("2.UpdateCustomer");
		System.out.println("3.DeleteCustomer");
		System.out.println("4.getalldaCustomer");
		System.out.println("5.getbyidCustomer");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
		{
			customer = new Customer();
			System.out.println("Enter the CustomerName");
			customer.setName(scanner.next());
			System.out.println("Enter the CustomerEmail");
			customer.setEmail(scanner.next());
			customerDao.saveCustomer(customer);
			
		}
		case 2 :
		{
			
			customer = new Customer();
			System.out.println("Enter the id");
			int id = scanner.nextInt();
			System.out.println("Enter the  new CustomerName");
			String name = scanner.next();
			System.out.println("Enter the  new Customeremail");
			String email = scanner.next();
			customerDao.updateCustomer(name,email,id);
			
		}
		case 3 :
		{
			
			customer = new Customer();
			System.out.println("Enter the id");
			int id = scanner.nextInt();
			
			customerDao.deleteCustomer(id);
			
		}
		case 4:{
			customer = new Customer();
			customerDao.getAllData();
			
			
		}
		case 5 :{
			System.out.println("enter c id");
			int id = scanner.nextInt();
			customerDao.getCustomerData(id);
			
		}
			
		}
	}
	}

}
