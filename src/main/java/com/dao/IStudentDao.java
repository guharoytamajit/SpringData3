package com.dao;

import com.entity2.Student;

public interface IStudentDao {
	Student create(Student employee);

	Student read(Integer id);

	Student update(Student employee);

	void delete(Student employee);
}
