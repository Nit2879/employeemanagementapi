package com.employee.management.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;


@RestController
@RequestMapping(path = "/emp", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.ALL_VALUE})
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;

	Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping(path = "/all")
	public List<Employee> getAllEmployee()
	{
		log.info("Controller class call started=================================================");
		List<Employee>  employeeList=employeeService.getAllEmployees();
		log.info("Controller class call ended====================================================");
		return employeeList;
	}

	@GetMapping(path = "/empid/{empid}")
	public Optional<Employee> getEmployeeByID(@PathVariable("empid") long empid){
		log.info("Controller class call started=================================================");
		Optional<Employee>  employeeList=employeeService.getEmployeeByID(empid);
		log.info("Controller class call ended====================================================");
		return employeeList;
	}
	
	@PostMapping(path = "/addemp")
    public Employee createEmployee(@RequestBody Employee employee) {
        log.info("Insert employee...");
        return employeeService.addEmployee(employee);
    }
}
