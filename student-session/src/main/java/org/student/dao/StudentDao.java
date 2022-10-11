package org.student.dao;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.sql.Select;
import org.student.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	Student student = new Student();

	public Student saveStudent(Student student) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;

	}

	public Student updateStudent(int id, String name, String email) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Student s2 = entityManager.find(Student.class, id);
		s2.setStudentname(name);
		s2.setStudentemail(email);

		entityTransaction.begin();
		entityManager.merge(s2);
		entityTransaction.commit();
		return s2;
	}

	public List<Student> getAllStudent() {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		String select = "Select s From Student s";
		Query query = entityManager.createQuery(select);
		List<Student> student = query.getResultList();
		return student;

	}

	public Student getStudentById(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Student.class, id);

	}

	public Student updateStudentById(Student student, int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		Student s2 = entityManager.find(Student.class, id);

		if (s2 != null) {
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();

		} else {
			return null;
		}

		return student;

	}

	public Student deleteStudent() {
		entityManager = entityManagerFactory.createEntityManager();
		String select = "Select s From Student s";
		return student;

	}

}
