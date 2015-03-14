package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IStudentDao;
import com.entity2.Student;

@Service
@Transactional(value = "transactionManager2")
public class StudentServiceImpl implements IStudentSvc {

	@Autowired
	IStudentDao studentDao;

	public Student create(Student student) {
		return studentDao.create(student);
	}

	public Student read(Integer id) {
		return studentDao.read(id);
	}

	public Student update(Student student) {
		return studentDao.update(student);
	}

	public void delete(Student student) {
		studentDao.delete(student);
	}

}
