package com.maneesh.spring.logger;

import org.apache.log4j.Logger;

public class SpringLogger {
	private Logger logger = Logger.getLogger(SpringLogger.class);
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}  
  
	public String getName() {  
		return name;  
	}  
  
	public void setName(String name) {  
		this.name = name;  
	}  
    
	public SpringLogger()
	{
		logger.info("This is default constructor - info");		
	} 
	
	public void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
		logger.error("This is display method - info");	
	}
    
}
