package com.maneesh.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {
	public static void main(String[] args) {  
		AbstractApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		BeanLifeCycle obj = (BeanLifeCycle)context.getBean("beanLifeCycle");  
		obj.displayInfo();
		
		// registerShutdownHook() will ensures a graceful shutdown and 
		// calls the relevant destroy methods.
		context.registerShutdownHook();
	}  
}
