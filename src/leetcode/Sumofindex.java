package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Sumofindex {

	public static void main(String[] args) {
	
		int[] input = {2,8,7,15};
		int target = 9;
		
//		
		ArrayList<Integer> complement = new ArrayList<Integer>();
	
		Arrays.stream(input).forEach(i->{
			complement.add(target-i);
		});
		
		
		
		System.out.println(complement);
		
		
		
//		for (int i=0;i<input.length;i++) {
//			
//			for (int j=i+1;j<input.length;j++) {
//				
//				if (input[i]+input[j]==target) {
//					
//					System.out.println(i +" " +j);
//				}
//			}
//		}
		
		
		
	}
	
	    public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> seen = new HashMap<>();
	        for (int i = 0; i < nums.length; ++i) {
	            int b = nums[i];
	            int	a = target - b;
	            if (seen.containsKey(a)) return new int[]{seen.get(a), i}; // Found pair of (a, b), so that a + b = target
	            seen.put(b, i);
	        }
	        return new int[]{};
	    }
	

}
