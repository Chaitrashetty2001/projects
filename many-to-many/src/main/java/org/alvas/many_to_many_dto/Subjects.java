package org.alvas.many_to_many_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sbid;
private String sbname;
private String sbauthor;
public int getSbid() {
	return sbid;
}
public void setSbid(int sbid) {
	this.sbid = sbid;
}
public String getSbname() {
	return sbname;
}
public void setSbname(String sbname) {
	this.sbname = sbname;
}
public String getSbauthor() {
	return sbauthor;
}
public void setSbauthor(String sbauthor) {
	this.sbauthor = sbauthor;
}



}
