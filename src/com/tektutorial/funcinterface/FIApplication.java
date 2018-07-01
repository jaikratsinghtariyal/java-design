package com.tektutorial.funcinterface;

import java.util.function.Function;

import models.Employee;

public class FIApplication {

	public static void main(String[] args) {
		// Lambda Expression Way
		Test test = new Test();
		Long x = (long) 10;
		Square obj = (Long y) -> x * x;
		System.out.println(obj.doSquare(x));
		System.out.println(test.sayHello(x, (value) -> value * value));

		// Method Reference Way
		Square s = new SquareImpl();
		print(s::doSquare, x);

		// Constructor Way
		EmployeeProvider provider = Employee::new;
		Employee emp = provider.getEmployee("John Doe", 34000);
		
		System.out.printf("Name: %s%n", emp.getName());
		System.out.printf("Age: %d%n", emp.getSalary());

	}

	public static void print(Function<Long, Long> function, Long value) {
		System.out.println(function.apply(value));
	}

}

class SquareImpl implements Square {

	public SquareImpl() {

	}

	public SquareImpl(Long number) {

	}

	@Override
	public Long doSquare(Long number) {
		return number * number;
	}

}

class Test {
	public Long sayHello(Long num, Square sqaure) {
		return sqaure.doSquare(num);
	}
}
