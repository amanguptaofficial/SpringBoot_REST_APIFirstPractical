package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	private static List<Employee> list = new ArrayList<Employee>();

	static {
		list.add(new Employee(101, "Aman1", "delhi1"));
		list.add(new Employee(102, "akash2", "indore2"));
		list.add(new Employee(103, "akash3", "indore3"));
		list.add(new Employee(104, "akash4", "indore4"));
		list.add(new Employee(105, "akash5", "indore5"));
		list.add(new Employee(106, "akash6", "indore6"));
		list.add(new Employee(107, "akash7", "indore7"));
	}

	public List<Employee> getAllData() {
		return list;
	}
}
