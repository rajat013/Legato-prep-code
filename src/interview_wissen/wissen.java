package interview_wissen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class wissen {

	public static void main(String[] args) {
		
//		int [] ar= {1,2,3,4,5,6,7};
//		
//		System.out.println(Arrays.stream(ar).filter(i->i%2!=0).map(i->i*i).sum());		
//		
//		//System.out.println(1+25+9+49);

		
		
//		Given an array of n integers and a number k, 
//		find the pairs of numbers in the array such that the difference between the pair is k
//		
//		int ar[] = new int[8];
//		int k = 0;
//		int pairs=0;
//		int x=ar[0];
//		
//		for (int i =0;i<ar.length;i++) {
//			
//			
//			for(int j =i+1;j<ar.length;j++) {
//				
//				if (ar[i]-ar[j]==k) {
//					pairs++;
//				}
//			}
//		}
		
		
		
		String input = "Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them";
		
		//even leghth word
		
		String split[] = input.split("[ ,]");
				
		
		
		
		System.out.println(Arrays.toString(split));
		
		String longest= Arrays.stream(split).filter(i->i.length()%2==0).sorted((x,y)->{
			return y.length()-x.length();
		}).findFirst().get();
		
		
		System.out.println("========"+ longest);
		
		
		
//		int a= 122333;
//		
//		System.out.println(Integer.toString(a));
//		
//		String converted= Integer.toString(a);
//		
//		
//		Set <Character>set= new HashSet<Character>();
//		
//		for (int i=0;i<converted.length();i++) {
//			
//			set.add(converted.charAt(i));
//		}
//	
//		System.out.println(set.size());
		
	}

}
