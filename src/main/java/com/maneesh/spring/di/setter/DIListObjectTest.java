package com.maneesh.spring.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maneesh.spring.di.inheritance.DIInheritance;

public class DIListObjectTest {
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		DIListObject obj = (DIListObject)context.getBean("diListObject1");  
		obj.displayInfo();
	}  

}
