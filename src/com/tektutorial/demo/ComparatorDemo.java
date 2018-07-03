package com.tektutorial.demo;

import java.util.Arrays;
import java.util.Collections;

import com.tektutorial.models.Employee;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Tejas", 1, 10000, "Male", "English");
		Employee e2 = new Employee("Rahul", 2, 2000, "Male", "Hindi");
		Employee e3 = new Employee("Pavan", 3, 3000, "Male", "Geography");
		Employee e4 = new Employee("Priya", 4, 4000, "Female", "History");
		Employee e5 = new Employee("Akash", 5, 4000, "Male", "History");
		Employee e6 = new Employee("Poonam", 6, 6000, "Female", "English");
		Employee e7 = new Employee("Anand", 7, 7000, "Male", "Hindi");
		Employee e8 = new Employee("Roopam", 8, 8000, "Female", "Maths");
		Employee e9 = new Employee("Amit", 9, 3000, "Male", "Physics");
		
		var employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9);	
		System.out.println(employees);
		Collections.sort(employees, new EmployeeNameComparator());		
		System.out.println(employees);
	}
}
