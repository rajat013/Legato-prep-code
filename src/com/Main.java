package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author AG80943
 *
 */
public class Main {

	public static void main(String[] args) {
		//System.out.println("this works");
		
//		 ArrayList<Integer> list = new ArrayList<Integer>();
//		 
//	        list.add(1);
//	        list.add(2);
//	        list.add(3);
//	        list.add(4);
//	        list.add(5);
	        
//	        System.out.println(list.stream().reduce((a,b)->{
//	        	return a+b;
//	        }).get());
	        
	        //System.out.println(list.stream().reduce((v, v1)->String.valueOf(v)));
	        
	       //System.out.println( list.stream().map(v->v*v).filter(v->v>10).mapToInt(v->v).average().getAsDouble());
	        
//	        list.stream().mapToInt(v->v*v).filter(v->v>10).
	       
	      // System.out.println(list.stream().min(Comparator.naturalOrder()).get());
	       
	       
	        List<String> list = new ArrayList<String>();
	        list.add("Saket");
	        list.add("Saurav");
	        list.add("Softwaretestinghelp");
	        list.add("Steve");
	        
	        
	        list.stream().filter(i->i.startsWith(i, 'a')).forEach(i->System.out.println(i));
	        
	        List<String> list2 = new ArrayList<String>();
	        list2.add("Saket");
	        list2.add("Saurav");
	        list2.add("Softwaretestinghelp");
	        
	        System.out.println(list.stream().filter(list2::contains).collect(Collectors.toList()));
	        
	        
	        System.out.println(list.stream().filter(i->{
	        	 return list2.contains(i);
	        }).collect(Collectors.toList()));
	        
	        
	        List<String> newlist = new ArrayList<String>();
	        
	        list.forEach(i->{
	        	if(list2.contains(i)) {
	        		newlist.add(i);
	        	}
	        });
	        
	        System.out.println(newlist);
	        
	        Stream<String> stream=newlist.stream();
	        
	        System.out.println(stream);
	        
//	      System.out.println( list.stream().filter(v->v.length()>5).count());
//	        
//	      String [] ar= {"rajat","mohit"};
//	      
//	      List list1= Arrays.asList(ar);
//	      
//	      System.out.println(list1);
//	      
//	    System.out.println(  Arrays.stream(ar).findFirst().get());
//	  IntStream.iterate(0, (i)->i+1).limit(5)
//	  .forEach(item->System.out.println(item));
	      
//	        int a =1;int b= 2; int c= 2;
//	        
//	        if  (a==b & b==c ) {
//	        	System.out.println("all are true inside");
//	        }
//	        else {
//	        	System.out.println("something is false");
//	        }
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
