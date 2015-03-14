package com.dao;

import org.springframework.stereotype.Repository;

import com.entity2.Student;

@Repository
public class StudentDaoImpl extends GenericDaoJpaImpl2<Student, Integer>
		implements IStudentDao {

}
