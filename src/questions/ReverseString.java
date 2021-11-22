package questions;

import java.util.Arrays;



public class ReverseString {

	public static void main(String[] args) {
		
		 String a = "rajat";
		 
		System.out.println(Arrays.toString(a.toCharArray()));
		
		System.out.println(a.toCharArray().getClass().getSimpleName());
		
		 
		 
		 StringBuilder sb= new StringBuilder(a);
		 
		  System.out.println(sb.reverse().toString());
	}

}
