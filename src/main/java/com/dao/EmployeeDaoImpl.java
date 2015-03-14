package com.dao;

import org.springframework.stereotype.Repository;

import com.entity1.Employee;

@Repository
public class EmployeeDaoImpl extends GenericDaoJpaImpl<Employee, Integer>
		implements IEmployeeDao {

}
