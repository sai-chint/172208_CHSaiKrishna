package com.spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		BankAccountController controller=(BankAccountController)context.getBean("BankAccountBean");
		System.out.println(controller.getBalance(100));
		System.out.println(controller.getBalance(101));
		System.out.println("after----------------------------------------");
		System.out.println(controller.fundTransfer(100,101,1000));
		System.out.println(controller.getBalance(100));
		System.out.println(controller.getBalance(101));
		
		System.out.println(controller.deposit(100,100000));
		
	}
}
