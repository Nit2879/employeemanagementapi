package com.employee.management.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@Column(name = "employee_id")
	private long employeeId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "hireDate")
	private Date hire_date;
	@Column(name = "job_id")
	private int jobId;
	@Column(name = "salary")
	private BigDecimal salary;
	@Column(name="manager_id")
	private int managerId;
	@Column(name="department_id")
	private int departmentId;
	
}
