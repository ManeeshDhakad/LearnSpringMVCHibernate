package com.maneesh.spring.di.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIInheritanceTest {

	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		DIInheritance obj = (DIInheritance)context.getBean("diInheritance2");  
		obj.displayInfo();
	}  
}
