package com.example.domain;

public class Director extends Manager {
	private double Budget;

	public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary, String string, String string2) {
		super(employeeId, employeeName, employeeSSN, employeeSalary);
		this.Budget = Budget;
	}

	public double getBudget() {
		return Budget;
		
	}

}
