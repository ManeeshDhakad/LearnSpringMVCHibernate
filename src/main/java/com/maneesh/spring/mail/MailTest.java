package com.maneesh.spring.mail;

import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
public class MailTest {   
	public static void main(String[] args) {  
		
		Resource r = new ClassPathResource("application-context.xml");  
		BeanFactory b = new XmlBeanFactory(r);  
		SendEMail m = (SendEMail)b.getBean("sendEMail");  
		String sender = "maneeshdhakad67@gmail.com";//write here sender gmail id  
		String receiver = 
				"maneeshdhk@gmail.com";//write here receiver id  
		m.sendMail(sender,receiver,"hi","welcome");  
		      
		System.out.println("success"); 
		 
	}
}  