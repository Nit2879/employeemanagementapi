package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeByID(long empID) {
		
		return employeeRepository.findById(empID);
	}
	
	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
}
