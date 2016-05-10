package com.maneesh.spring.di.collection;

import java.util.Iterator;
import java.util.List;

public class DIList 
{ 
	private int id;  
	private String name;  
	private List<String> skills;  

	public DIList() {
		System.out.println("Default Constructor!");
	}  
	
	public DIList(int id, String name, List<String> skills) {  
		super();  
		this.id = id;  
		this.name = name;  
		this.skills = skills;  
	}  

	public void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name); 
		System.out.println("Skills:");  
		
		Iterator<String> itr = skills.iterator();  
		
		while (itr.hasNext()) {  
			System.out.println(itr.next());  
		}  
	}  
}