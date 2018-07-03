package com.tektutorial.models;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{

	private String name;
	private int id;
	private int salary;
	private String gender;
	private String departments;

	public Employee() {
		name = "unknown";
		salary = 1000;
	}

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getDepartment() {
		return departments;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(String name, int id, int salary, String gender, String departments) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.gender = gender;
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", gender=" + gender + ", departments="
				+ departments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee emp) {
		if(this.salary > emp.salary)
			return 1;
		else if(this.salary < emp.salary)
			return -1;
		return 0;
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.salary > emp2.salary)
			return -1;
		else if (emp1.salary < emp2.salary)
			return 1;
		return 0;
	}
}
