package com.maneesh.spring.lifecycle;

public class BeanLifeCycle {
	private int id;
	private String name;

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

	public void displayInfo() {  
		System.out.println("Personal Details:\nID = " + id + ",  Name = " + name);  
	}  

	// Call init() during initializing of bean in container
	public void init(){
		System.out.println("Bean initialization starts!!");
	}
	
	// Call destroy() before a bean is removed from the container.
	public void destroy(){
		System.out.println("Bean Destroy now!!");
	}
}