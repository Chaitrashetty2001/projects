package org.alvas.spring_core_first_simple.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args) {
		
		
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext();
Student student=  (Student) beanFactory.getBean("myStudent");
student.getStudent();

	}

}
