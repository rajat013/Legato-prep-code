package questions;

import java.util.Arrays;

public class SumofInteger {

	public static void main(String[] args) {

		int a= 874375;



		String converted_int=	String.valueOf(a);
		System.out.println(converted_int);

		System.out.println(Arrays.toString(converted_int.toCharArray()));

		int arr[]=new int [converted_int.length()];

		for (int i=0;i<converted_int.length();i++) {

			arr[i]= converted_int.charAt(i)-'0';
		
			System.out.println(arr[i]);
				
		}
		
		System.out.println(Arrays.stream(arr).sum());

		//			int ar[]= {1,2,34,4};
		//			
		//			System.out.println(Arrays.toString(converted_int.getBytes()));

		
		


	}

}
