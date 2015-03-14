package com.entity2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int roll;
	String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + "]";
	}

	public Student(int eid, String name) {
		super();
		this.roll = eid;
		this.name = name;
	}

	public Student() {
		super();
	}

}
