package com.maneesh.spring.di.collection;

import java.util.Iterator;
import java.util.List;

import com.maneesh.spring.Address;

public class DIListObject {
	private int id;  
	private String name;  
	private List<Address> addresses;  

	public DIListObject() {
		System.out.println("Default Constructor!");
	}  
	
	public DIListObject(int id, String name, List<Address> addresses) {  
		super();  
		this.id = id;  
		this.name = name;  
		this.addresses = addresses;  
	}  

	public void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name); 
		System.out.println("Adresses:");  
		
		Iterator<Address> itr = addresses.iterator();  
		
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}  
	}  
}
