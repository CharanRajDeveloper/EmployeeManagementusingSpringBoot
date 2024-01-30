package com.ems.EmployeeManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.EmployeeManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
