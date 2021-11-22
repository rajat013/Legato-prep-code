package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mohit_interview {
	
	public static void main(String [] args) {
		
		Student s1= new Student("mohit",1);
		
		Student s2= new Student("rajat",2);
		
		Student s3= new Student("mohit",1);
		
		List<Student> ar1= new ArrayList<Student>();
		
		
		
		Set<Student> hs1= new HashSet<Student>();
		hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		
		Set<Student> hs2= new HashSet<Student>();
		hs2.add(s1);
		hs2.add(s2);
		hs2.add(s3);
		
		
		System.out.println(hs1.size());  //3
		
		System.out.println(hs1.equals(hs2));   //true    //false
		
		System.out.println(hs1==hs2);  //false
		
		System.out.println(hs1.hashCode()+" "+hs2.hashCode());
		
		
		
		
//		StringBuffer sb1= new StringBuffer("hello");
//		StringBuffer sb2= new StringBuffer("hello");
		
//		StringBuilder builder1=new StringBuilder("rajat");
//		StringBuilder builder2= new StringBuilder("rajat");
		
		String builder1=new String("rajat");
		String builder2= new String("rajat");
//		
		System.out.println("string builder "+ builder1==(builder2));
		
//		System.out.println(sb1.equals(sb2));   // true
//		
//		System.out.println(sb1==sb2);  //false
		
		
		
		String str1 = new String("sunil");
		String str2 = new String("sunil");

		HashMap hm = new HashMap();
		hm.put(str1,"hello");
		hm.put(str2,"bye");
		
		System.out.println(hm);
		
		System.out.println(hm.get("sunil"));
		
	}

}
