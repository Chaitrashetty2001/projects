package com.aiet1.hibernetproject1.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, 102);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		System.out.println("Deleted");

	}

}
