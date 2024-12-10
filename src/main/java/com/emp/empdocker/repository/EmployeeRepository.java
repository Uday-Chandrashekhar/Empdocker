package com.emp.empdocker.repository;

import com.emp.empdocker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



import com.emp.empdocker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
