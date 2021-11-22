package com_static;

public class Main {

	public static void main(String[] args) {

		Child a= new Child();
		
	
		a.setName("soap");
		
		xy(a);
		
		System.out.println(a.getName());

			
	
	
	}
	
	public static void xy(Child c) {
		
		c.setName("rajat");
	}
	

}
	