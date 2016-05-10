package com.maneesh.spring.autowiring;

public class ByName {
	private int id;
	private String name;
	private ByNameAddress byNameAddress;

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
	  
	public ByNameAddress getByNameAddress() {
		return byNameAddress;
	}

	public void setByNameAddress(ByNameAddress byNameAddress) {
		this.byNameAddress = byNameAddress;
	} 
  
	void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
		System.out.println("Address: " + byNameAddress.toString());  
	}  
}
