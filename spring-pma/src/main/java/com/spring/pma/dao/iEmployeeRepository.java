package com.spring.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.pma.entity.Employee;
import com.spring.pma.entity.Project;

public interface iEmployeeRepository extends CrudRepository<Project, Long> {

	public default void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public default List<Employee> findAll() {
		return null;
		// TODO Auto-generated method stub
	}

}
