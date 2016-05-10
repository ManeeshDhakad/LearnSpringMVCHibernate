package com.maneesh.spring.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIListObjectTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		DIListObject obj = (DIListObject) context.getBean("diListObject");
		obj.displayInfo();
	}
}
