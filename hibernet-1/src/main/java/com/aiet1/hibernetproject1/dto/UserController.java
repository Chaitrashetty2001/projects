package com.aiet1.hibernetproject1.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = new User();
		user.setId(143);
		user.setName("Athul");
		user.setEmail("athul@gmail.com");

		entityTransaction.begin();
		entityManager.persist(user);

		entityTransaction.commit();

	}

}
