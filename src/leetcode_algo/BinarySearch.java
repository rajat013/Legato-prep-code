package leetcode_algo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {


		int []nums = {-1,0,3,5,9,12};int target = 9;
		//System.out.println(search(nums,target));
		
		System.out.println(Arrays.binarySearch(nums, 9));

	}

	public static int search(int[] nums, int target) {

		int result=0;
		if(nums.length==1) {
			 result=nums[0];
			
		}
		else if (nums[nums.length/2]==target) {
			 result=nums[nums.length/2];
		}
		
		else if (nums[nums.length/2]>target) {
			
			int nums1[]= new int[nums.length/2] ;
			for (int i=0;i<nums.length/2;i++) {
				nums1[i]=nums[i];
				break;
			}
			search(nums1,target);
		}
		else if(nums[nums.length/2]<target) {
			int nums2[]= new int[nums.length/2] ;
			
			for (int i=0;i<nums.length/2;i++) {
				nums2[i]=nums[nums.length/2+i];
			}
			
			search(nums2,target);
			
		}
		return result;
		
		
	}
}
