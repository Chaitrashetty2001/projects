package com.aiet3.hibernate3.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.aiet3.hibernate3.dto.Customer;

public class CustomerDao {

	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		public Customer saveCustomer(Customer customer) {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			
			if(customer != null) {
				entityTransaction.begin();
				entityManager.persist(customer);
				entityTransaction.commit();
				System.out.println("Data Stored");
			}
			else {
				System.out.println("plz set the data");
			}
		

			
			return customer;

			
		}
		public Customer updateCustomer(String name,String email,int id) {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			Customer customer = entityManager.find(Customer.class,id);
			customer.setName(name);
			customer.setEmail(email);
			
			if(customer != null) {
				entityTransaction.begin();
				entityManager.persist(customer);
				entityTransaction.commit();
				System.out.println("Data Stored");
			}
			else {
				System.out.println("plz set the data");
			}
		

			
			return customer;

			
		}
		public Customer deleteCustomer(int id)
		{
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			Customer customer = entityManager.find(Customer.class,id);
			
			
			if(customer != null) {
				entityTransaction.begin();
				entityManager.remove(customer);
				entityTransaction.commit();
				System.out.println("Data removed");
			}
			else {
				System.out.println("plz set the data");
			}
		

			
			return customer;

			
		}
		public List<Customer> getAllData() {
			
	
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		String query = "SELECT u FROM Customer u";
	 Query query2 = entityManager.createQuery(query);
	 List<Customer> list= query2.getResultList();
	 list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n "+ a.getEmail()));
	return null;
		}
		public Customer getCustomerData(int id) {
			
			
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
Customer customer = entityManager.find(Customer.class,id);
System.out.println(customer);
			
		
		return null;
		}
}


