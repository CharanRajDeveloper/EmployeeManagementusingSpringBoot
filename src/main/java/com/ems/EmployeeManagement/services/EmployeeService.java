package com.ems.EmployeeManagement.services;

import com.ems.EmployeeManagement.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	EmployeeDto getEmployeeId(Long empId);

}
