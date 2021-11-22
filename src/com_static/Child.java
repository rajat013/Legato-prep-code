package com_static;

public class Child extends Parent  {

	public Child(){
		System.out.println("constructor called");
	}

	public  void display() {
		
		System.out.println("from child");
		//return "child";
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

