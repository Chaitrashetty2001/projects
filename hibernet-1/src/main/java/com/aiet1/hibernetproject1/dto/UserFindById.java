package com.aiet1.hibernetproject1.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserFindById {
	public static void main(String[] args) {
	EntityManagerFactory  entityManagerFactor = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactor.createEntityManager();
	User user = entityManager.find(User.class, 10);
	System.out.println(user);
	
	

}
}
