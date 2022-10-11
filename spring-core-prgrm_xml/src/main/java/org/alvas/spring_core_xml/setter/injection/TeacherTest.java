package org.alvas.spring_core_xml.setter.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new  ClassPathXmlApplicationContext("setter-injection.xml");
	Teacher teacher = 	 (Teacher) applicationContext.getBean("myTeacher");
	System.out.println(teacher.getId());
	System.out.println(teacher.getName());
	System.out.println(teacher.getSub());
	}

}
