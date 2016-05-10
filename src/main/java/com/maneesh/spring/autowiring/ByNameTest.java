package com.maneesh.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameTest {
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		ByName obj = (ByName)context.getBean("byName");  
		obj.displayInfo();
	}  
}
