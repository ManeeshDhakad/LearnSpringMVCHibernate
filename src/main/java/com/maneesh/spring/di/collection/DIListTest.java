package com.maneesh.spring.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIListTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		DIList obj = (DIList) context.getBean("diList");
		obj.displayInfo();
	}

}
