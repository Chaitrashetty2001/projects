package org.alvas.spring_core_xml.object.reference.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTester {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("object-reference.xml");
		Laptop laptop =   (Laptop) applicationContext.getBean("myLaptop");
		laptop.getLaptop();
	}

}
