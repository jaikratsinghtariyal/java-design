package com.tektutorial.funcinterface;

import models.Employee;

@FunctionalInterface
public interface EmployeeProvider {
	Employee getEmployee(String name, Integer salary);
}