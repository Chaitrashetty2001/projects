package org.alvas.spring_core_xml_annotation.constructor;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor-injection.xml");
		Customer customer = (Customer) applicationContext.getBean("myCustomer");
		customer.print();
			}

	}


