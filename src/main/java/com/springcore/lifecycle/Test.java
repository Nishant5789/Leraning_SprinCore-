package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		// we need to register hook to called destroymethod
		context.registerShutdownHook();
		

		Samosa s = (Samosa) context.getBean("samosa");
		System.out.println(s);
		 
		
		Pepsi p = (Pepsi) context.getBean("pepsi");
		System.out.println(p);
		
		
		// added anotation depency in po,.xml and add annotationbean in config.xml 
		
		Vadapav v = (Vadapav) context.getBean("vadapav");
		System.out.println(v);
		
	}
}
