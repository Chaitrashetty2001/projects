
 package many_to_many_bi.Controller;

import java.util.Arrays;
import java.util.List;

import many_to_many_bi.dao.CarDao;
import many_to_many_bi.dto.Car;
import many_to_many_bi.dto.Features;

public class CarController {

	public static void main(String[] args) {
		CarDao carDao = new CarDao();
		Car car1 = new Car();
		Car car2 = new Car();
		
		Features feature1 = new Features();
		Features feature2 = new Features();
		
		car1.setCarName("BMW2");
		car1.setCarPrice(100000);
		
		car2.setCarName("TESLA");
		car2.setCarPrice(10000000);
		
		List<Car> cars =  Arrays.asList(car1,car2);
		
		feature1.setFeatureName("Automatic Drive");
		feature2.setFeatureName("BULLET PROFF");
		
		List<Features> features = Arrays.asList(feature1,feature2);
		
		car1.setFeatures(features);
		car2.setFeatures(features);
		
		feature1.setCar(cars);
		feature2.setCar(cars);
		carDao.saveCar(cars, features);
	}

}
