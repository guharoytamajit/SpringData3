package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.builder.EmployeeBuilder;
import com.builder.StudentBuilder;
import com.config.SpringRootConfig;
import com.entity1.Employee;
import com.entity2.Student;
import com.service.IEmployeeSvc;
import com.service.IStudentSvc;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringRootConfig.class })
public class EmployeeServiceTest {
	@Autowired
	IEmployeeSvc employeeSvc;
	@Autowired
	IStudentSvc studentSvc;

	@Test
	public void testEmployeeSave() {
		Employee employee = EmployeeBuilder.anyEmployee();
		Employee createdEmployee = employeeSvc.create(employee);
		Assert.assertEquals(employee.getEid(), createdEmployee.getEid());
		Assert.assertEquals(employee.getName(), createdEmployee.getName());

		Student anyStudent = StudentBuilder.anyStudent();
		Student student = studentSvc.create(anyStudent);
		Assert.assertEquals(anyStudent.getRoll(), student.getRoll());
		Assert.assertEquals(anyStudent.getName(), student.getName());
	}
}
