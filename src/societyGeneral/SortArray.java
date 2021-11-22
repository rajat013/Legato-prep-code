package societyGeneral;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int [] ar= {2,5,84,26,14,52,36};

		for (int i=0;i<ar.length;i++) {

			for (int j=i+1;j<ar.length ;j++) {

				int temp=0;
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}		}

		System.out.println(Arrays.toString(ar));
//		for (int i = 0; i < arr.length; i++)   
//		{  
//			for (int j = i + 1; j < arr.length; j++)   
//			{  
//				int tmp = 0;  
//				if (arr[i] > arr[j])   
//				{  
//					tmp = arr[i];  
//					arr[i] = arr[j];  
//					arr[j] = tmp;  
//				}  
//			}  
//			//prints the sorted element of the array  
//			System.out.println(arr[i]);  
//		}  
	}

}
