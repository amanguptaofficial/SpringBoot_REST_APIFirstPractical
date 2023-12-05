package com.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private EmployeeService emp;

	@GetMapping("getData")
	public List<Employee> getData() {

		return this.emp.getAllData();
	}

}
