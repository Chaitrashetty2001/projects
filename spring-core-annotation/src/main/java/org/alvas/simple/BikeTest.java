package org.alvas.simple;

import org.alvas.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
 Bike bike =    (Bike) applicationContext.getBean("myBike");
 bike.getBike();
	}

}
