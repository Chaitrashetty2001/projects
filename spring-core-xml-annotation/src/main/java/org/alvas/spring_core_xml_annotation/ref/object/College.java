package org.alvas.spring_core_xml_annotation.ref.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value = "myCollege")
public class College {
@Autowired
Branch branch;

@Autowired
public College(Branch branch) {
	super();
	this.branch = branch;
}


public void getCollege() {
	branch.getBranch();
	
}

}
