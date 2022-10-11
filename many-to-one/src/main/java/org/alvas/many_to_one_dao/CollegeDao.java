package org.alvas.many_to_one_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_one_dto.Building;
import org.alvas.many_to_one_dto.College;



public class CollegeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Building  saveBuildingCollege(College college,Building building1,Building building2) {
		
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityManager.persist(building1);
		entityManager.persist(building2);
		entityTransaction.commit();
		return building2;
		

}}
