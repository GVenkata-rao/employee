package com.sm.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.employee.entity.Employee;
import com.sm.employee.reponse.EmployeeReponse;
import com.sm.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{id}")
	public EmployeeReponse getEmployeeDetails(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);

	}

	@PostMapping("/employees/")
	public Employee SaveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}
}
