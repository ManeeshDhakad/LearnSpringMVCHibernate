package com.maneesh.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTest {
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		Prototype obj1 = (Prototype)context.getBean("prototype");  
		obj1.setId(100);
		obj1.setName("Maneesh Dhakad");
		obj1.displayInfo();
		
		// Prototype create each time new object
		Prototype obj2 = (Prototype)context.getBean("prototype"); 
		obj2.displayInfo();
		
	}  
}
