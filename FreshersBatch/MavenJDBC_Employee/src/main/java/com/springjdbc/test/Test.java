package com.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.Employee;
import com.springjdbc.dao.EmpDAOImp;
import com.springjdbc.services.EmpServicesImp;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e=new Employee();
//       e.setEmpno(918);
//        e.setEname("Sai");
//        e.setJob("Analyst");
//        e.setMgr(7902);
//        //e.setHiredate(1-2-19);
//        e.setSal(14356);
//        e.setComm(0);
 //     e.setDeptno(20);
        
        EmpDAOImp d=(EmpDAOImp) context.getBean("empdao");
        // d.insert(e);
        // d.update(e);
        // d.delete(e);
         d.orderBy();
        //d.groupBy();
           
        EmpServicesImp ser=new EmpServicesImp();
      	// ser.addEmp(e);
      	// ser.updateEmp(e);
      	// ser.deleteEmp(e);
//     	 ser.getEmp(e);
//     	 ser.getMaxSal();
//     	 ser.getEmpWithoutComm();

//      	List<Employee> list= ser.getEmp(e);
//        
//         for(Employee e1:list)
//         {
//       	  	System.out.println(e1);
//         }
//        
//      	List<Employee> list1= d.getAll();
//        
//         for(Employee e1:list1)
//         {
//        	 System.out.println(e1);
//         }
        
          List<Employee> list1= d.orderBy();
        
         for(Employee e1:list1)
         {
       	 System.out.println(e1);
         }
         
//         List<Employee> list1= d.groupBy();
//         
//         for(Employee e1:list1)
//         {
//       	 System.out.println(e1);
//         }
	}

}

