package com.employee.management.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@RequestMapping(path = "/emp", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.ALL_VALUE})
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@GetMapping(path = "/all")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
}
