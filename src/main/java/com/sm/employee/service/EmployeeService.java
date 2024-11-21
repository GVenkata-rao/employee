package com.sm.employee.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.employee.entity.Employee;
import com.sm.employee.repo.EmployeeRepo;
import com.sm.employee.reponse.EmployeeReponse;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;

	public EmployeeReponse getEmployeeById(Long id) {
		Employee employee = employeeRepo.findById(id).get();

		EmployeeReponse employeeReponse = modelMapper.map(employee, EmployeeReponse.class);

		return employeeReponse;

	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

}
