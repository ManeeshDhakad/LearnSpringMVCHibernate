package com.maneesh.spring.di.setter;

import java.util.Iterator;
import java.util.List;

import com.maneesh.spring.Address;

public class DIListObject {
	private int id;  
	private String name;  
	private List<Address> addresses;  

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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
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
