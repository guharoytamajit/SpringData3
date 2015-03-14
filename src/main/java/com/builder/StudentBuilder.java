package com.builder;

import com.entity2.Student;

public class StudentBuilder {

	private Student student = new Student();

	public static StudentBuilder newInstance() {
		return new StudentBuilder();
	}

	public StudentBuilder roll(int roll) {
		student.setRoll(roll);
		return this;
	}

	public StudentBuilder name(String name) {
		student.setName(name);
		return this;
	}

	public Student build() {
		return this.student;
	}

	public static Student anyStudent() {
		return newInstance().roll(8).name("name").build();
	}
}