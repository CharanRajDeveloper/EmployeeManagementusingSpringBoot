package com.ems.EmployeeManagement.services;

import java.util.List;

import com.ems.EmployeeManagement.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	EmployeeDto getEmployeeId(Long empId);
	List<EmployeeDto> getAllEmployees();
	EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);
	void deleteEmployee(Long employeeId);
}
