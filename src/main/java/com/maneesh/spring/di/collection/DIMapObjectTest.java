package com.maneesh.spring.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMapObjectTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		DIMapObject obj = (DIMapObject) context.getBean("diMapObject");
		obj.displayInfo();
	}

}
