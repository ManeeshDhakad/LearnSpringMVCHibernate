package com.maneesh.spring.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class DISetterTest {  
	public static void main(String[] args) {  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("application-context.xml");  
      
		DISetter obj = (DISetter)context.getBean("diSetter");  
		obj.displayInfo();  
	}  
}  