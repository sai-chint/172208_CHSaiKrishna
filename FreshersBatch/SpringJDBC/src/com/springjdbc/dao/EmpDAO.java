package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.Employee;

public interface EmpDAO {
	
	public List<Employee> getAll();
	public boolean insert(Employee e);
	public boolean delete(Employee e);
	public boolean update(Employee e);
	public List<Employee> orderBy();
	public List<Employee> groupBy();
	public List<Employee> employee(Employee e);
		
}
