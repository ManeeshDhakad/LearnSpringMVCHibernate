package com.maneesh.spring.scope;

public class Singleton {
	
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
