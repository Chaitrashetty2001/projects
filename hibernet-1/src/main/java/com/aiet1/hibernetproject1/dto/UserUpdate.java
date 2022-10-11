package com.aiet1.hibernetproject1.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserUpdate {

	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactor = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactor.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user = entityManager.find(User.class, 10);	//primary key
		user.setName("AdishK");	//Change name
		entityTransaction.begin();
		
//		entityManager.persist(user); For update always user merge method
		entityManager.merge(user);
		
		entityTransaction.commit();
		System.out.println("Updates Successfull");

	}

}
