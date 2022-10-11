package org.alvas.spring_core_xml_annotation.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myUser")
public class User {
	
@Value(value = "21")	
int id;

@Value(value = "athul")
String name;

public void print()
{
	System.out.println(id);
	System.out.println(name);
}

}
