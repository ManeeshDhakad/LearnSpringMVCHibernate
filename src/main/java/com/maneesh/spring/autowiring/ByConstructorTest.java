package com.maneesh.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByConstructorTest {
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		ByConstructor obj = (ByConstructor)context.getBean("byConstructor");  
		obj.displayInfo();
	}  
}
