package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
	
	public void Duplicates() {
		
	}

	public static void main(String[] args) {
		
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

		//Arrays.stream(strArray).so
		//.distinct().forEach(i->System.out.println(i));
		
		
		int[] intarray= {47498, 14526, 74562, 42681, 75283, 45796};
		
		System.out.println(Arrays.stream(intarray)
		.sorted().toArray()[intarray.length-2]);
		
		
		int[] arrayOne = {21, 57, 11, 37, 24};
        
        int[] arrayTwo = {21, 57, 11, 37, 24};
        
        System.out.println(Arrays.asList(arrayOne).equals(Arrays.asList(arrayTwo)));
		System.out.println(Arrays.equals(arrayOne, arrayTwo));
//		System.out.println(Arrays.as);
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(-(-4));
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		int a =Collections.max(list);
		
	}
	

}
