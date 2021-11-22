package com;

import java.util.TreeSet;

public class TreeSetQues {

	public static void main(String[] args) {
		
		Student s1= new Student ("rajat",1);
		Student s2= new Student ("rajat",2);
		Student s3= new Student ("rajat",3);
		

		TreeSet<Student> ts= new TreeSet<>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		System.out.println(ts);
	}

}
