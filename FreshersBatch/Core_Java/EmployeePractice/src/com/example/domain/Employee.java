package com.example.domain;

public class Employee {
	//instance variable,class variable,variables declaration
	//why variables are required?--->to store values
	//why datatypes are required?--->
	//why is the value stored inside each datatype?--->
	//what is access specifier>--->
	//what are the diff. types of access specifier>--->
	//public private protected default?--->
	//Encapsulation?--->data hiding , making private
	
	private int employeeId;
	private String employeeName;
	private String employeeSSN;
	private double employeeSalary;
	
	
	//why super() is used in code?--->
	
	//why getters and setters are used?--->
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public Employee(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSSN = employeeSSN;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSSN() {
		return employeeSSN;
	}
	
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public double raiseSalary(double increase) {
		return employeeSalary+increase;
	}


}
