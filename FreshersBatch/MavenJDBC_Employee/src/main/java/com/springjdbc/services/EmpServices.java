package com.springjdbc.services;

import java.util.List;

import com.springjdbc.Employee;

public interface EmpServices {

	public boolean addEmp(Employee e);
	public boolean deleteEmp(Employee e);
	public boolean updateEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public String getMaxSal();
	public boolean getEmpWithoutComm();
	
}
