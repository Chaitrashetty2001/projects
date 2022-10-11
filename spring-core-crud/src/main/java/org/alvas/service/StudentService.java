package org.alvas.service;

import org.alvas.dao.Studentdao;
import org.alvas.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value ="myService")
public class StudentService {
	 @Autowired
	 Studentdao studentdao;

	 public Student saveStudent(Student student) {
		 
		 //bussines logic
		 if(student.getId()>100) {
			 return studentdao.saveStudent(student);
		 }else {
			 System.out.println("hey you shoukld provide id");
			 return null;
		 }
	 }
}
