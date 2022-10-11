package org.alvas.spring_core_xml.constructor.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor-injection.xml");
User user = (User) applicationContext.getBean("myUser");
System.out.println(user.id);
System.out.println(user.name);
	}

}
