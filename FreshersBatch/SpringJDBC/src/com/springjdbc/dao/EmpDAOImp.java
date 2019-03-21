package com.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.springjdbc.Employee;
import com.springjdbc.mapper.EmployeeMapper;

public class EmpDAOImp implements EmpDAO {

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	@Override
	public List<Employee> getAll() {
		 String sql="select * from emp";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}

	@Override
	public boolean insert(Employee e) {
			String query="insert into emp values(?,?,?,?,?,?,?)";
			System.out.println("Welcome to insert ");  
			
			return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		   
			@Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		             
		        ps.setInt(1,e.getEmpno());  
		        ps.setString(2,e.getEname());  
		        ps.setString(3,e.getJob());  
		        ps.setInt(4, e.getMgr());
		        //ps.setInt(4, e.getHiredate());
		        ps.setInt(5,e.getSal());
		        ps.setInt(6,e.getComm());
		        ps.setInt(7, e.getDeptno());
		        System.out.println("Insertion completed"); 
		        return ps.execute();  
		        
		    }          
		    });

		
	}

	@Override
	public boolean delete(Employee e) {
		String SQL = "delete from emp where empno = "+e.getEmpno();
	      this.jdbcTemplate.update(SQL);
	      System.out.println("Deleted Record with ID = " + e.getEmpno());
		return true;
	}

	@Override
	public boolean update(Employee e) {
		String updateQuery = "update emp set sal = ? where empno = ?";
			this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpno());
		return true;
	}

	@Override
	public List<Employee> orderBy() {
		
		String sql="select * from emp order by ename";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		 
	}

	@Override
	public List<Employee> groupBy() {
		
		String sql="select * from emp group by deptno order by ename desc";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}

	@Override
	public List<Employee> employee(Employee e) {
		
		String sql="select * from emp where empno="+e.getEmpno();
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}

}
