package com.empTest;

import com.arrayEmp.ArrayEmployee;


public class TestEmployee {
	public static void main(String[] args) {
		
		ArrayEmployee arremp = new ArrayEmployee();
		System.out.println("Enter the employee details : ");
		arremp.addNewEmployee();
		arremp.Display();
		System.out.println(arremp.Search());
		
	}
}
