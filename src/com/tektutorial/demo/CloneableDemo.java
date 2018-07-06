package com.tektutorial.demo;

import com.tektutorial.models.Student;

public class CloneableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(101, "Jacob");
		System.out.println(student1.getStudentId() + " - " + student1.getStudentName());
		
		Student student2 = student1.clone();
		System.out.println(student2.getStudentId() + " - " + student2.getStudentName());
		
		
	}
}
