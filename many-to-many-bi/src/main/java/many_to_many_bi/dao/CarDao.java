package many_to_many_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_bi.dto.Car;
import many_to_many_bi.dto.Features;

public class CarDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public List<Car> saveCar(List<Car> cars,List<Features> features) {
		
		entityManager =entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();		
		
		entityTransaction.begin();
		for(Features feature : features)
		{
			entityManager.persist(feature);
		}
		for(Car car : cars)
		{
			entityManager.persist(car);
		}
		entityTransaction.commit();
		
	
		return cars;
	
		
	}

}
