package com.aiet1.hibernetproject1.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserGetByNameController {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactor = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactor.createEntityManager();

		String query = "SELECT u FROM User u where u.name=?1";
		Query query2 = entityManager.createQuery(query);
		query2.setParameter(1, "Amisha");
		List<User> list = query2.getResultList();
		list.forEach(a -> System.out.println(a.getId() + "\n" + a.getName() + "\n " + a.getEmail()));
	}

}
