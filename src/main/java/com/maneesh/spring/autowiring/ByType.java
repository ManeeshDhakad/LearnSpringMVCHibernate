package com.maneesh.spring.autowiring;

public class ByType {
	private int id;
	private String name;
	private ByTypeAddress byTypeAddress;

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
	  
	public ByTypeAddress getByTypeAddress() {
		return byTypeAddress;
	}

	public void setByTypeAddress(ByTypeAddress byTypeAddress) {
		this.byTypeAddress = byTypeAddress;
	} 
  
	void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
		System.out.println("Address: " + byTypeAddress.toString());  
	}  

}
