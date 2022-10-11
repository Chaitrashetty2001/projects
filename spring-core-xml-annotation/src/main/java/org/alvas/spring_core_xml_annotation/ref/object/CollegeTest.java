package org.alvas.spring_core_xml_annotation.ref.object;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
		College college =  (College) applicationContext.getBean("myCollege");
		college.getCollege();

	}

}
