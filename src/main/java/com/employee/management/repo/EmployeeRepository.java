/**
 * 
 */
package com.employee.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.management.entity.Employee;

/**
 * @author nitesh_kumar
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
