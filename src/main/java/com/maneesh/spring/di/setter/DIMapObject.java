package com.maneesh.spring.di.setter;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.maneesh.spring.Answer;
import com.maneesh.spring.Question;

public class DIMapObject {
	
	private int id;  
	private String name;  
	private Map<Question,Answer> interview;  
	
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

	public Map<Question, Answer> getInterview() {
		return interview;
	}

	public void setInterview(Map<Question, Answer> interview) {
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
