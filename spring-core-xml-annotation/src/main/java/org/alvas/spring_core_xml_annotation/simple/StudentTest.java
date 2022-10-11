package org.alvas.spring_core_xml_annotation.simple;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
Student student = (Student) applicationContext.getBean("myStudent");
student.getStudent();
	}

}
