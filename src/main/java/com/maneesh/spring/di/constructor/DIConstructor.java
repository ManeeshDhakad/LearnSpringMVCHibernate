package com.maneesh.spring.di.constructor;

public class DIConstructor {
	private int id;  
	private String name;  

	public DIConstructor() {
		System.out.println("Default Constructor!");
	}  

	public DIConstructor(int id) {
		this.id = id;
	}  

	public DIConstructor(String name) {  
		this.name = name;
	}  

	public DIConstructor(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  

	void displayInfo()	{  
		System.out.println("Personal Details:\nID = " + id  + ",  Name = " + name); 
	}  

}  