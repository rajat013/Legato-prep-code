package com;

public class interview_2 {

	public static void main(String[] args) {

		Student s1= new Student("mohit",1);

		Student s2= new Student("rajat",2);

		Student s3= new Student("pratik",3);
		
		Student s5= new Student("pratik",3);
		
		Student s4= s3;
		
		
			
		System.out.println(s1==s2);  //false
		
		System.out.println(s1.equals(s2));   //false
		
		System.out.println(s5.equals(s3));   //false
		
		System.out.println(s4==s5);        // false
		
		System.out.println(s4==s3);          //true
		
		System.out.println(s3==s5);      //false
		
		System.out.println(s3.equals(s5));   //false
		
		
		
		
	
		

	}
	

}
