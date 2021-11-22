package leetcode;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		//int nums[]= {-2,1};
		int nums[]={-2, -3, 4, -1, -2, 1, 5, -3};;
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		int sum=nums[0];
		int intsum=0;
		
		for (int i=0;i<nums.length;i++) {
			//System.out.println("sum in outer loop beginning ====== "+ sum);
			//System.out.println("index ========= "+i);
			
			if(nums[i]>sum) {
				sum= nums[i];
				//intsum=nums[i];
				
			}
			intsum=nums[i]; 
			//System.out.println("intsum declared in outer loop ===== "+ intsum);
			
			
			for (int j=i+1;j<nums.length;j++) {
				intsum+=nums[j];
				//System.out.println("int sum in inner loop====== "+ intsum);
				if(intsum>sum) {
					sum=intsum;
				}
			}
		}
		
		return sum;
	}

}
