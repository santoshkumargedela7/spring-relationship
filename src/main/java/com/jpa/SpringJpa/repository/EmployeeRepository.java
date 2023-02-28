package com.jpa.SpringJpa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.SpringJpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
		
	List<Employee> findByFirstName(String firstName);
}
