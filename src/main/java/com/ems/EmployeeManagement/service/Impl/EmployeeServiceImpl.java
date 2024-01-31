package com.ems.EmployeeManagement.service.Impl;

import org.springframework.stereotype.Service;

import com.ems.EmployeeManagement.dto.EmployeeDto;
import com.ems.EmployeeManagement.entity.Employee;
import com.ems.EmployeeManagement.exceptions.ResourceNotFoundException;
import com.ems.EmployeeManagement.mapper.EmployeeMapper;
import com.ems.EmployeeManagement.repositories.EmployeeRepository;
import com.ems.EmployeeManagement.services.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeId(Long empId) {
	Employee employee=employeeRepository
			          .findById(empId)
			          .orElseThrow(() -> new ResourceNotFoundException("Employee is not exist with the given Employee ID"+empId));
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

}
