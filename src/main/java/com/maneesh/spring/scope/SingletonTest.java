package com.maneesh.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maneesh.spring.di.setter.DISetter;

public class SingletonTest {

	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		Singleton obj1 = (Singleton)context.getBean("singleton");  
		obj1.setId(100);
		obj1.setName("Maneesh Dhakad");
		obj1.displayInfo();
		
		// Singleton create single instance per Spring IoC container (default).
		Singleton obj2 = (Singleton)context.getBean("singleton"); 
		obj2.displayInfo();
		
	}  
}
