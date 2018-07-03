package com.tektutorial.demo;

import java.util.Comparator;

import com.tektutorial.models.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());		
	}

}
