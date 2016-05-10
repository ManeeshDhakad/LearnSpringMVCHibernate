package com.maneesh.spring.di.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.maneesh.spring.Answer;
import com.maneesh.spring.Question;

public class DIMapObject {
	private int id;  
	private String name;  
	private Map<Question,Answer> interview;  
	
	public DIMapObject() {
		System.out.println("Default Constructor!");
	}  
	
	public DIMapObject(int id, String name, Map<Question,Answer> interview) {  
		super();  
		this.id = id;  
		this.name = name;  
		this.interview = interview;  
	}  


	public void displayInfo(){  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name); 
		System.out.println("Interview process:");
		
		Set<Entry<Question,Answer>> set = interview.entrySet();  
		Iterator<Entry<Question,Answer>> itr = set.iterator(); 
		
		while(itr.hasNext()){  
			Entry<Question,Answer> entry = itr.next();  
			Question que = entry.getKey();  
			Answer ans = entry.getValue(); 
			
			System.out.println(que);   
			System.out.println(ans);
		}  
		
	}  

}
