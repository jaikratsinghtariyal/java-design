package com.tektutorial.models;

public class Student implements Cloneable{

	private int studentId;
	private String studentName;
	
	public Student() {
		studentId = 0;
		studentName = "";
	}
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
	}
	
	@Override
	public Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
