package com.maneesh.spring.di.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DIMap {
	private int id;  
	private String name;  
	private Map<String,String> grades;  
	  
	public DIMap() {
		System.out.println("Default Constructor!");
	}  
	
	public DIMap(int id, String name, Map<String, String> grades) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.grades = grades;  
	}  
	  
	public void displayInfo(){  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name); 
		System.out.println("Grades:");  
		
	    Set<Entry<String, String>> set=grades.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println(entry.getKey() + " = " + entry.getValue());  
	    }  
	}   

}
