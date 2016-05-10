package com.maneesh.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class DIConstructorTest {  
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		DIConstructor obj = (DIConstructor)context.getBean("diConstructor");  
		obj.displayInfo();
	}  
}  