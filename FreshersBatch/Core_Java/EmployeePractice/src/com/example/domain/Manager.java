package com.example.domain;

public class Manager extends Employee {

	public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
		super(employeeId, employeeName, employeeSSN, employeeSalary);
		// TODO Auto-generated constructor stub
	}
private String deptName;
public Manager(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String deptName) {
	super(employeeId, employeeName, employeeSSN, employeeSalary);
	this.deptName = deptName;
}
public String getDeptName() {
	return deptName;
}


}
