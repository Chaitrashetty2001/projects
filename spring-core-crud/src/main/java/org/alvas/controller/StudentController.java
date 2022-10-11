package org.alvas.controller;

import org.alvas.MyConfig;
import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentController {
	@Autowired
	static Student student;
	
	@Autowired
	
	
	static StudentService service;
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student student1 = (Student) applicationContext.getBean("myStudent");
		
		student.setId(100);
		System.out.println(student.getId());
		student.setName("CHAITRA");
		student.setEmail("c@gmail.com");
		
	student1.saveStudent(student);
;	}

}
