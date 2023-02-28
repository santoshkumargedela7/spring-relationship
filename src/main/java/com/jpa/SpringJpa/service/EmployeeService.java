package com.jpa.SpringJpa.service;

import java.util.List;

import com.jpa.SpringJpa.entity.Employee;
import com.jpa.SpringJpa.entity.Project;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Project> findByTitle(String title);

	public List<Employee> getAll();

	public Employee getById(Long employeeId);

	public List<Employee> findByFirstName(String firstName);


}
