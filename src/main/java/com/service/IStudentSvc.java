package com.service;

import com.entity2.Student;

public interface IStudentSvc {
	Student create(Student employee);

	Student read(Integer id);

	Student update(Student employee);

	void delete(Student employee);
}
