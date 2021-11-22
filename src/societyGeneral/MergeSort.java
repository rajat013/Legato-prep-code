package societyGeneral;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
		mergeSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

	public static void mergeSort(int ar[],int low,int high) {

		if (low>= high) {
			return;
		}
		else {
			int mid = (low+high)/2;

			mergeSort(ar, low, mid);
			mergeSort(ar, mid+1, high);
			merge(ar,low,mid,high);
		}
	}

	public static void merge(int ar[],int low,int mid,int high) {


		int left[]=new int[mid-low+1];
		int right[]=new int[high-mid ];

		for (int i=0;i<left.length;i++) {
			left[i]=ar[low+i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=ar[mid+i+1];
		}
		int leftindex=0;
		int rightindex=0;


		for (int i=low;i<high+1;i++) {
			if (leftindex<left.length && rightindex<right.length) {
				if (left[leftindex]<right[rightindex]) {
					ar[i]=left[leftindex];
					leftindex++;
				}
				else {
					ar[i]=right[rightindex];
					rightindex++;
				}
			}

			else if(leftindex<left.length){

				ar[i]=left[leftindex];
				leftindex++;


			}
			else if(rightindex<right.length){

				ar[i]=right[rightindex];
				rightindex++;


			}
		}
	}

	//	public static void mergeSort(int[] array, int low, int high) {
	//	    if (high <= low) return;
	//
	//	    int mid = (low+high)/2;
	//	    mergeSort(array, low, mid);
	//	    mergeSort(array, mid+1, high);
	//	    merge(array, low, mid, high);
	//	}
	//	
	//	public static void merge(int[] array, int low, int mid, int high) {
	//	    // Creating temporary subarrays
	//	    int leftArray[] = new int[mid - low + 1];
	//	    int rightArray[] = new int[high - mid];
	//
	//	    // Copying our subarrays into temporaries
	//	    for (int i = 0; i < leftArray.length; i++)
	//	        leftArray[i] = array[low + i];
	//	    for (int i = 0; i < rightArray.length; i++)
	//	        rightArray[i] = array[mid + i + 1];
	//
	//	    // Iterators containing current index of temp subarrays
	//	    int leftIndex = 0;
	//	    int rightIndex = 0;
	//
	//	    // Copying from leftArray and rightArray back into array
	//	    for (int i = low; i < high + 1; i++) {
	//	        // If there are still uncopied elements in R and L, copy minimum of the two
	//	        if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
	//	            if (leftArray[leftIndex] < rightArray[rightIndex]) {
	//	               array[i] = leftArray[leftIndex];
	//	               leftIndex++;
	//	            } else {
	//	                array[i] = rightArray[rightIndex];
	//	                rightIndex++;
	//	            }
	//	        } else if (leftIndex < leftArray.length) {
	//	            // If all elements have been copied from rightArray, copy rest of leftArray
	//	            array[i] = leftArray[leftIndex];
	//	            leftIndex++;
	//	        } else if (rightIndex < rightArray.length) {
	//	            // If all elements have been copied from leftArray, copy rest of rightArray
	//	            array[i] = rightArray[rightIndex];
	//	            rightIndex++;
	//	        }
	//	    }
}

