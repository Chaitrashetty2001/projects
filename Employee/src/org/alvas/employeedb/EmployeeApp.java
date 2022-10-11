package org.alvas.employeedb;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		Employee employee = new Employee();
		System.out.println("emp id");
		employee.id = scanner.nextInt();
		System.out.println("emp name");
		employee.name= scanner.next();
		System.out.println("emp email");
		employee.email = scanner.next();
		System.out.println("emp id");
		employee.salary = scanner.nextDouble();
		Employee employee2 = dao.savaEmployee(employee);
		if(employee2 != null)
			
		{
			System.out.println("data stored");
			
		}
		else {
			System.out.println("plese check your data");
		}
		

	}

}
