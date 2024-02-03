package com.ems.EmployeeManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.EmployeeManagement.dto.EmployeeDto;
import com.ems.EmployeeManagement.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//Add Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	//Get Employee by ID REST API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployeId(@PathVariable("id") Long employeeId) {
		EmployeeDto getEmployeebyId = employeeService.getEmployeeId(employeeId);
		return ResponseEntity.ok(getEmployeebyId);
	}
	
	//Get Employee REST API
	@GetMapping
	public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
		List<EmployeeDto> employeeDto=employeeService.getAllEmployees();
		return new ResponseEntity<>(employeeDto,HttpStatus.ACCEPTED);
	}

}
