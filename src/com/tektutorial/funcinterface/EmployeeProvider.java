package com.tektutorial.funcinterface;

import com.tektutorial.models.Employee;

@FunctionalInterface
public interface EmployeeProvider {
	Employee getEmployee(String name, Integer salary);
}