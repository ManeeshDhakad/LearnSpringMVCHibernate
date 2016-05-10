package com.maneesh.spring.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLoggerTest {
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		SpringLogger obj = (SpringLogger)context.getBean("springLogger");  
		obj.displayInfo();
	}  
}
