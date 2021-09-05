package com.ajith.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	@Before("execution(* add*(com.ajith.aopdemo.Account,..))")
	@Before("execution(* com.ajith.aopdemo.dao.*.*(..))")
//	@Before("execution(public void updateAccount())")
	public void beforeAddAccountAdvice(){
		System.out.println("\n=====>>> Execution @Before advice on method()");
	}
}
