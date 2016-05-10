package com.maneesh.spring.di.setter;

public class DISetter { 
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
  
	public void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
	}  
}  