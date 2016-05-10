package com.maneesh.spring;

public class Answer {
	private int num;
	private String ans;  
		  
	public Answer(int num, String ans) {  
		super();  
		this.num = num;
		this.ans = ans; 
	}  
  
	public String toString() {  
		return "Ans " + num + " : " + ans;  
	}  
}
