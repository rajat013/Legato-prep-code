package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Merge {

	public static void main(String[] args) {

		//int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6};int n = 3;
		int[] nums1 = {0}; int m = 0; int[] nums2 = {1};int n = 1;
		
		merge(nums1,m,nums2,n);
		
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		if (m==0) {
			for (int i=0;i<nums2.length;i++) {
				nums1[m+i]=nums2[i];
//				/System.out.println(Arrays.toString(nums1));
			}
			
			System.out.println(Arrays.toString(nums1));
		}
		else if(n==0){
			System.out.println(nums1);
		}
		
		else {
			for (int i=0;i<nums2.length;i++) {
				nums1[m+i]=nums2[i];
//				/System.out.println(Arrays.toString(nums1));
			}
//			System.out.println(Arrays.toString(nums1));
			Arrays.sort(nums1);
		}

	}


}
