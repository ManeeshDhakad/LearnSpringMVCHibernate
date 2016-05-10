package com.maneesh.spring.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMapTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		DIMap obj = (DIMap) context.getBean("diMap");
		obj.displayInfo();
	}
}
