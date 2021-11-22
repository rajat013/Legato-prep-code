package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1}; int[]nums2 = {2,2};
		System.out.println(intersect(nums1,nums2));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {

				 ArrayList al= new ArrayList<>();
				
				Arrays.stream(nums1).forEach(i->{
					
					Arrays.stream(nums2).forEach(j->{
						if(i==j) {
							al.add(j);
						}
					});
					
				});
			
				
			
				
				int [] ar= new int[al.size()];
				for (int i=0;i<al.size();i++) {
					ar[i]= (int) al.get(i);
				}
						System.out.println(al);
				return ar;

		





	}
}
