package com.tektutorial.demo;

import java.util.Arrays;
import java.util.function.Predicate;

import models.Employee;

public class CollectionProg {

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
		
		//Print Male employess AND salary > 3000
		Predicate<Employee> pred = MaleEmployeePredicate.isMaleEmp().and(SalaryEmployeePredicate.isSalaryAbove3000());
		employees.stream().filter(pred).map(Employee:: getName).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Print Male employess OR salary > 3000
		Predicate<Employee> pred2 = MaleEmployeePredicate.isMaleEmp().or(SalaryEmployeePredicate.isSalaryAbove3000());
		employees.stream().filter(pred2).map(Employee:: getName).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Is new emplyoee same as this Akash
		Predicate<Employee> pred3 = Predicate.isEqual(new Employee("Akash", 9, 3000, "Male", "Maths"));
		System.out.println(pred3.test(new Employee("Kailash", 10, 4000, "Male", "Hindi")));
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Print name of Non English Department employees
		Predicate<Employee> pred4 = DepartmenEmployeePredicate.isEnglishDeptEmp().negate();
		employees.stream().filter(pred4).map(Employee:: getName).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}
}

class MaleEmployeePredicate {
	
	public static Predicate<Employee> isMaleEmp() {
		return emp -> emp.getGender().equalsIgnoreCase("Male");
	}
}
class SalaryEmployeePredicate {
	
	public static Predicate<Employee> isSalaryAbove3000() {
		return emp -> emp.getSalary() > 3000;
	}
}
class FemaleEmployeePredicate {
	
	public static Predicate<Employee> isFemaleEmp() {
		return emp -> emp.getGender().equalsIgnoreCase("Female");
	}
}
class DepartmenEmployeePredicate {
	
	public static Predicate<Employee> isEnglishDeptEmp() {
		return emp -> emp.getDepartment().contains("English");
	}
}

