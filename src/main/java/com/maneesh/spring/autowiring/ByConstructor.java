package com.maneesh.spring.autowiring;

public class ByConstructor {
	private int id;  
	private String name;  
	private ByConstructorAddress address;//Aggregation  
  
	public ByConstructor() {
		System.out.println("Default Constructor!");  
	}  
  
	public ByConstructor(int id, String name, ByConstructorAddress address) {  
		super();  
		this.id = id;  
		this.name = name;  
		this.address = address;  
	}  
  
	void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
		System.out.println("Address: " + address.toString());  
	}  

}
