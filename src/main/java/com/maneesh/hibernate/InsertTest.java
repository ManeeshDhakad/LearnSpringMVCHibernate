package com.maneesh.hibernate;

import java.util.Iterator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertTest {  
	public static void main(String[] args) {  

		AbstractApplicationContext context =   
				new ClassPathXmlApplicationContext("hibernate.cfg.xml");  

		EmployeeDao dao=(EmployeeDao)context.getBean("empDao");  
		
		// Insert record
		Employee emp1=new Employee();
		emp1.setId(186056); 
		emp1.setName("Archu");  
		emp1.setSalary(60000);  
		dao.saveEmployee(emp1); 
		System.out.println("Record inserted");

		// Select all records
		Iterator<Employee> empList = dao.getEmployees().listIterator();  
				
		while(empList.hasNext()) {  
			System.out.println(empList.next());  
		}  
		
		//Update record
		Employee emp2=new Employee();
		emp2.setId(186053); 
		emp2.setName("Dhakad Maneesh");  
		emp2.setSalary(60000);  
		dao.updateEmployee(emp2);  
		System.out.println("Record Updated");
		
		// Select all records
		empList = dao.getEmployees().listIterator();  
						
		while(empList.hasNext()) {  
			System.out.println(empList.next());  
		}  
		
		// Delete record
		Employee emp3=new Employee();
		emp3.setId(186053); 
		dao.deleteEmployee(emp3);
		
		
		// Select record
		empList = dao.getEmployees().listIterator();  
		
		while(empList.hasNext()) {  
			System.out.println(empList.next());  
		}  
		
	}  
}  