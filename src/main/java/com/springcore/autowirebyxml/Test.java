package com.springcore.autowirebyxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 	new ClassPathXmlApplicationContext("com/springcore/autowirebyxml/autowireconfig.xml");
		
		Emp e1 = context.getBean("emp", Emp.class);
		
		System.out.println(e1);
		
			
			
	}

}
