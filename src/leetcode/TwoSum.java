package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		 
		int []nums = {2,7,11,15};
		
		System.out.println(Arrays.toString(twoSum(nums, 9)));
		

	}
	
	 public static int[] twoSum(int[] nums, int target) {
		 
//		 for (int i=0;i<nums.length;i++) {
//			 
//			 for(int j=i+1;j<nums.length;j++) {
//				 
//				 if (nums[i]+nums[j]==target) {
//					 return new int[] {i,j};
//				 }
//			 }
//		 }
		 
		 
		 Map<Integer,Integer> hm= new HashMap<>();
		 
		 for (int i=0;i<nums.length;i++) {
			 
			 int b= nums[i];
			 int c =target-b;
			 
			 if(hm.containsKey(c)) {
				 return new int[] {hm.get(c),i};
			 }
			 else {
				 hm.put(b, i);
			 }
		 }
		 
		return null;
	        
	        
	    }

}
