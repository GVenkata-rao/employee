package com.sm.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sm.employee.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

}
