package com.maneesh.spring.autowiring;

public class ByNameAddress {
	private String city;  
	private String state;  
	private String country;  
  
	public ByNameAddress(String city, String state, String country) {  
		super();  
		this.city = city;  
		this.state = state;  
		this.country = country;  
	}  
  
	public String toString() {  
		return city + " " + state + " " + country;  
	}  

}
