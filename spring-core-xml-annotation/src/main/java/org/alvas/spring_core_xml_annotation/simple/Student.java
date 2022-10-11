package org.alvas.spring_core_xml_annotation.simple;

import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
	public void getStudent()
	{
		System.out.println("CSE Student");
	}

}
