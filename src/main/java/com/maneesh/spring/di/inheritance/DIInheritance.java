package com.maneesh.spring.di.inheritance;

import com.maneesh.spring.Address;

public class DIInheritance {

	private int id;  
	private String name;  
	private Address address;  
	
	public DIInheritance() {
		System.out.println("Default Constructor!");
	}  
	  
	public DIInheritance(int id, String name) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	}  
	public DIInheritance(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void displayInfo(){  
		System.out.println("Personal Details:\nID = " + id  + ",  Name = " + name); 
		System.out.println("Address:"); 
	    System.out.println(address);  
	}  
	  
}  