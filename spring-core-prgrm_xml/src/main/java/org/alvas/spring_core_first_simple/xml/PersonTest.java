package org.alvas.spring_core_first_simple.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext();
		Person person=   (Person) beanFactory.getBean("myPerson");
		person.getPerson();

	}

}
