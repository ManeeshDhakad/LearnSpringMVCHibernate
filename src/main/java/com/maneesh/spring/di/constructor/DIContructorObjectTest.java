package com.maneesh.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIContructorObjectTest {

	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		DIConstructorObject obj = (DIConstructorObject)context.getBean("diConstructorObject");  
		obj.displayInfo();
	}  
}
