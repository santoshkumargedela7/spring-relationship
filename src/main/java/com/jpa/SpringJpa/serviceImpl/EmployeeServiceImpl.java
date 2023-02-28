package com.jpa.SpringJpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.SpringJpa.entity.Employee;
import com.jpa.SpringJpa.entity.Project;
import com.jpa.SpringJpa.repository.EmployeeRepository;
import com.jpa.SpringJpa.repository.ProjectRepository;
import com.jpa.SpringJpa.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ProjectRepository repository;

	@Override
	public Employee addEmployee(Employee employee) {

		try {

			Employee emp1 = employeeRepository.save(employee);

			return emp1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Project> findByTitle(String title) {
		try {
			List<Project> project = repository.findByTitle(title);
			return project;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	@Override
	public List<Employee> getAll() {

		try {

			List<Employee> emp = employeeRepository.findAll();

			return emp;
		} catch (Exception e) {

		}

		return null;

	}

	@Override
	public Employee getById(Long employeeId) {
		Employee emp = employeeRepository.findById(employeeId).get();

		return emp;
	}

	@Override
	public List<Employee> findByFirstName(String firstName) {
		List<Employee> list = employeeRepository.findByFirstName(firstName);
		return list;
	}

}
