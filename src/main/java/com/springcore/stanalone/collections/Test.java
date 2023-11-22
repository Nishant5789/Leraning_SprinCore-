package com.springcore.stanalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stanalone/collections/stanaloneconfig.xml");
		
		Person p = context.getBean("person1", Person.class);
		System.out.println(p.getFriends());

		System.out.println(p.getFriends().getClass().getName());
	}

}
