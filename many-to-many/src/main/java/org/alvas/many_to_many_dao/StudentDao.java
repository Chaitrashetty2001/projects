package org.alvas.many_to_many_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.security.auth.Subject;

import org.alvas.many_to_many_dto.Student;
import org.alvas.many_to_many_dto.Subjects;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Student savestudent(Student student1,Student student2,List<Subjects> list) {
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		for (Subjects subject : list) {
			entityManager.persist(subject);			
		}
		entityTransaction.commit();
		

		return student1;
	
		
	}

}
