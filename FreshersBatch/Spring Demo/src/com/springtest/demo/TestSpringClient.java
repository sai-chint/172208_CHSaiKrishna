package com.springtest.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.spring.demo.Student;

public class TestSpringClient {

	public static void main(String[] args) {
		
		
		BeanFactory bean = new XmlBeanFactory(new FileSystemResource("Resource/spring.xml"));
		Student stu = (Student) bean.getBean("studentBean");
		stu.displayInfo();
		Student stu1 = (Student) bean.getBean("studentBean1");
		stu1.displayInfo();
		Student stu2 = (Student) bean.getBean("studentBean2");
		stu2.displayInfo();
		Student stu3 = (Student) bean.getBean("studentBean3");
		stu3.displayInfo();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student s= (Student) context.getBean("studentBean");
		s.displayInfo();
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		Student s1= (Student) context1.getBean("studentBean1");
		s1.displayInfo();
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
		Student s2= (Student) context2.getBean("studentBean2");
		s2.displayInfo();
		ApplicationContext context3 = new ClassPathXmlApplicationContext("spring.xml");
		Student s3= (Student) context3.getBean("studentBean3");
		s3.displayInfo();
		
	}

}
