package com.tektutorial.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import models.Employee;

public class StreamAPIsExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("Amit", 1, 2000, "Male", "English");
		Employee e2 = new Employee("Rahul", 2, 2000, "Male", "Hindi");
		Employee e3 = new Employee("Pavan", 3, 3000, "Male", "Geography");
		Employee e4 = new Employee("Priya", 4, 4000, "Female", "History");
		Employee e5 = new Employee("Akash", 5, 4000, "Male", "History");
		Employee e6 = new Employee("Poonam", 6, 6000, "Female", "English");
		Employee e7 = new Employee("Anand", 7, 7000, "Male", "Hindi");
		Employee e8 = new Employee("Roopam", 8, 8000, "Female", "Maths");
		Employee e9 = new Employee("Tejas", 9, 3000, "Male", "Physics");
		
		var employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9);		
		
		//Print name of male employees with salary > 2000
		employees.stream().filter(emp -> emp.getSalary() > 2000)
		.filter(emp -> emp.getGender().equals("Male")).map(Employee::getName)
		.forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Are all Employees male?
		System.out.println(employees.stream()
                   .allMatch(emp->emp.getGender().equals("Male")));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");		
		
		//Is any Employee male?
		System.out.println(employees.stream()
                   .anyMatch(emp->emp.getGender().equals("Male")));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");	
		
		//Group by all male employee and print them.
		System.out.println(employees.stream()
                 .collect(Collectors.groupingBy(Employee::getGender)).get("Male"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
				
		// Print count of the male employees with salary > 4000
		System.out.println(employees.stream().filter(emp -> emp.getSalary() > 4000)
        .filter(emp -> emp.getGender().equals("Male")).count());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		// Print distinct employees. Distinct depends of how you have implemented you equals methods.
		// We have equals and hashcode methods in Employee class on Gender and Salary fields.
		System.out.println(employees.stream().distinct().collect(Collectors.toList()).size());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Find any employee having salary > 3000. The result is not predictable.
		Optional op = employees.stream().filter(emp -> emp.getSalary() > 3000).findAny();
		System.out.println(op.get());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		Optional opFirst = employees.stream().filter(emp -> emp.getSalary() > 4000).findFirst();
		System.out.println(opFirst.get());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		
		//Print call employee name
		employees.stream().map(Employee :: getName).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
				
		//Prints highest salaried Employee
		System.out.println(employees.stream()
		  .max(new Comparator<Employee>() { 
		           @Override 
		           public int compare(Employee e1, Employee e2) { 
		               if (e1.getSalary() > e2.getSalary()) { 
		                   return 1; 
		               } else if (e1.getSalary() < e2.getSalary()) { 
		                   return -1; 
		               } return 0; 
		          } 
		 }).get());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Prints lowest salaried Employee		
		System.out.println(employees.stream()
	        .min(new Comparator<Employee>() { 
	             @Override public int compare(Employee e1, Employee e2) { 
	                 if (e1.getSalary() > e2.getSalary()) { 
	                    return 1; 
	                 } else if (e1.getSalary() < e2.getSalary()) { 
	                    return -1; 
	                 } return 0; 
	          } 
	    }).get());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Sort Employees based on given Comparator
		employees.stream()
		.sorted(new Comparator<Employee>() { 
		          @Override public int compare(Employee e1, Employee e2) { 
		             if (e1.getSalary() > e2.getSalary()) { 
		                 return 1; 
		             } else if (e1.getSalary() < e2.getSalary()) { 
		               return -1; 
		             } return 0; 
		         } 
		 }).forEach(System.out::println);
		
	}
}
