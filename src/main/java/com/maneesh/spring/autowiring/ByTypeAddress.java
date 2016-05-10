package com.maneesh.spring.autowiring;

public class ByTypeAddress {
	private String city;  
	private String state;  
	private String country;  
  
	public ByTypeAddress(String city, String state, String country) {  
		super();  
		this.city = city;  
		this.state = state;  
		this.country = country;  
	}  
  
	public String toString() {  
		return city + " " + state + " " + country;  
	}  


}
