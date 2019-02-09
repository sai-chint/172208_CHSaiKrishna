package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {
	
	public static void printEmployee(Employee e1) {
		System.out.println("Employee ID : "+ e1.getEmployeeId());
		System.out.println("Employee Name : "+ e1.getEmployeeName());
		System.out.println("Employee SSN : "+ e1.getEmployeeSSN());
		System.out.println("Employee Salary : "+ e1.getEmployeeSalary());
		
	}

	public static void main(String[] args) {
		// construct an instance of employee
		//ctrl+shift+'O'--->import employee package
		//what is system class,which package it is available?--->
		//what is the use of this class?--->
		Employee e1= new Employee(34,"qwe","2348-3",2324);
		e1.raiseSalary(2000);
		EmployeeTest.printEmployee(e1);
		System.out.println("------------------------");
		
		Manager m= new Manager(918, "sai", "12345", 343212,"US Marketing");
		m.raiseSalary(2990);
		//m.setEmployeeName("SaiKrishna");
		EmployeeTest.printEmployee(m);
		System.out.println("------------------------");
		
		Admin a= new Admin(1714, "chinna", "56786", 345611);
		a.raiseSalary(2940);
		a.setEmployeeName("chinna");
		EmployeeTest.printEmployee(a);
		System.out.println("------------------------");
		
		Director d= new Director(123, "nani", "7823", 30000, "Global Marketing","10_00_00.00");
		d.raiseSalary(5000);
		d.setEmployeeName("nani");
		EmployeeTest.printEmployee(d);
		System.out.println("------------------------");
	}
}
