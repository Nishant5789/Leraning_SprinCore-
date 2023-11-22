package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	   public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Emp e1 =  (Emp) context.getBean("emp1");
		
		System.out.println(e1.getAddress());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones());

		
	}

}
