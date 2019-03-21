package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape s = context.getBean("Shape",Shape.class);
		
		s.getCircle();
		s.getTriangle();
		
//		FactoryService fs= new FactoryService();
//		Shape s= (Shape) fs.getBean("shape");
//		
//		s.getCircle();
//		
		
	}
	
}
