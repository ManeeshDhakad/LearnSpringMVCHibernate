package com.maneesh.spring;

public class Question {
	private int num;
	private String que;  
	  
	public Question(int num, String que) {  
		super();  
		this.num = num;
		this.que = que; 
	}  
  
	public String toString() {  
		return "Que " + num + " : " + que;  
	}  
}
