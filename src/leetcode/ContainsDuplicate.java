package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int []nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
//		
//		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//		
//		HashSet<Integer> hs = new HashSet<Integer> ();
//		
//		
//		Arrays.stream(nums).forEach(i->{
//			
//			if (hs.contains(i)){
//				hm.put(i, hm.get(i)+1);
//			}
//			else {
//				hm.put(i, 1);
//			}
//		});
//		
//		for (int i=0;i<nums.length;i++) {
//			if (hm.containsKey(i)){
//				hm.put(i, hm.get(i)+1);
//			}
//			else {
//				hm.put(i, 1);
//			}
//		}
//		
//		System.out.println(hm);
//		
//		System.out.println(hm.containsValue(2));
//		
//		if( 2 <= hm.values().stream().mapToInt(i->i).max().getAsInt() ) {
//			
//		}

	}
	
	 public static boolean containsDuplicate(int[] nums) {
		    
	        
	        HashSet<Integer> hs = new HashSet<Integer> ();
	        for ( int i=0;i<nums.length;i++) {
	        	if(hs.add(nums[i])==false) {
	        		
	        		return true;
	        	}
	        }
	        return false;
	        	}
	        
	        
	        
//	        
//	        int i;
//	            for ( i=0;i<nums.length;i++) {
//	            	System.out.println(hs);
//				if (hs.contains(nums[i])){
//					return true;
//				}
//				else {
//					hs.add(nums[i]);
//				}
//	                
//			}
//	        return false;
//	     }
//	
	

}
