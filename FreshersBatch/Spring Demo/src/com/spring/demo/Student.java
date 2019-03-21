package com.spring.demo;

public class Student {

	String studentName;
	int studentId;
	int studentAge;
	
	public Student(String studentName, int studentId, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
	}
	
	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
	public void displayInfo() {
		System.out.println("My Name is " + studentName);
		System.out.println("My Id is" + studentId);
		System.out.println("My Age is" + studentAge);
	}
}
