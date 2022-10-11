package org.alvas.spring_core_xml_annotation.variable;

import org.alvas.spring_core_xml_annotation.simple.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
		User user = (User) applicationContext.getBean("myUser");
		user.print();

	}

}
