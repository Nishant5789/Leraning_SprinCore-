package com.springcore.streoannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streoannotation/config.xml");
		Student s1 = (Student) context.getBean("stu");
		
		System.out.println(s1);
	}

}
