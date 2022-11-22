package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  id;
	
	private long firtsName;
	
	private long lastName;
	
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(long firtsName) {
		this.firtsName = firtsName;
	}

	public long getLastName() {
		return lastName;
	}

	public void setLastName(long lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
