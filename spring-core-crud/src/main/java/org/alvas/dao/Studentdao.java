package org.alvas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.dto.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Studentdao {
//	@Autowired
//	Student student;

	@Autowired
	EntityManagerFactory entityManagerFactory;
//	=Persistence.createEntityManagerFactory("vikas");
//	EntityManager entityManager;
//	EntityTransaction entityTransaction;
	
		
	public Student saveStudent(Student student) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();		
		EntityTransaction entityTransaction = entityManager.getTransaction();	
		
		
//		entityManager=entityManagerFactory.createEntityManager();
//		entityTransaction=entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
		
	}

}
