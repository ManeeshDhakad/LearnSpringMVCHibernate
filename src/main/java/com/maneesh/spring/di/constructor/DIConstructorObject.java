package com.maneesh.spring.di.constructor;

import com.maneesh.spring.Address;

public class DIConstructorObject 
{
	private int id;  
	private String name;  
	private Address address;//Aggregation  
  
	public DIConstructorObject() {
		System.out.println("Default Constructor!");  
	}  
  
	public DIConstructorObject(int id, String name, Address address) {  
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
