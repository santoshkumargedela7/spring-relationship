package com.jpa.SpringJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.SpringJpa.entity.Employee;
import com.jpa.SpringJpa.entity.Project;
import com.jpa.SpringJpa.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class EmployeeController {
	
		
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		
		Employee emp1 = employeeService.addEmployee(employee);
		
		return new ResponseEntity<Employee>(emp1,HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Project>> findByTitle(@RequestParam("title") String title){
		List<Project>employee  = employeeService.findByTitle(title);
		return new ResponseEntity<List<Project>>(employee,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAll(){
	List<Employee>employee = employeeService.getAll();
	
		
		return new ResponseEntity<List<Employee>>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getById(@PathVariable("id") Long employeeId){
		Employee employee  = employeeService.getById(employeeId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/name")
	public ResponseEntity<List<Employee>> findByFirstName(@RequestParam("firstName") String firstName){
		List<Employee> list = employeeService.findByFirstName(firstName);
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
}
