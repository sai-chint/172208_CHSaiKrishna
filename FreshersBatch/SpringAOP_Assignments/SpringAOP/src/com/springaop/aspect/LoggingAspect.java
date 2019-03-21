package com.springaop.aspect;	

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {

//	@Before("allCircleMethods()")
//	public void loggingAdvice(JoinPoint joinPoint) {
//		
//		System.out.println(joinPoint.getTarget());
//	}
//	
//	@Before("args(name)")
//	public void stringArgumentMethods(String name) {
//		System.out.println("--------------"+name);
//	}
//	
//	@AfterReturning(pointcut="args(name)",returning="returnString")
//	public void stringArgumentsMethods(String name,Object returnString) {
//		System.out.println("--------------"+name+".----------"+returnString);
//	}
	
//	@Around("allGetters()")
//	public void myAroundAdvice(ProceedingJoinPoint pjp) {
//		try {
//			System.out.println("before");
//			pjp.proceed();
//			System.out.println("after");
//		} catch (Throwable e) {
//			System.out.println("after");
//			
//		}
//		System.out.println("after finally");
//	}
	
	//@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint pjp) {
		
		Object s=null;
		
		try {
			System.out.println("before");
			pjp.proceed();
			System.out.println("after");
		} catch (Throwable e) {
			System.out.println("after..");
			
		}
		System.out.println("after finally");
		return s;
	}
	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		
//		System.out.println("Second Advice run Get method called");
//	}
	
//	@Before("execution(public String com.springaop.Circle.getName())")
//	public void loggingAdvice() {
//		
//		System.out.println("Advice run Get method called");
//	}
	
//	@Pointcut("execution(public * get*())")
//	public void allGetters() {
//		
//	}

//	@Pointcut("within(com.springaop.Circle)")
//	public void allCircleMethods() {
//		
//	}
	
	public  void loggingAdvice() {
		System.out.println("!@#$%");
	}
	
}
