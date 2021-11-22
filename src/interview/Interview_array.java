package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Interview_array {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dups();
		//common();

		//smallest();

		//		String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
		//		System.out.println("Original Array:" + Arrays.asList(myArray));
		//		reverse(myArray);

		//		String a = "strawberry";
		//
		//		System.out.println(a instanceof String);

		//sum();

		//firstRepeat();
		
		thirdlargest();
	}


	public static void dups() {

		String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };

		HashSet<String> dis= new HashSet<>();
		ArrayList<String> dup =new ArrayList<>();

		Arrays.stream(arr1).forEach(i->{

			//			if(dis.contains(i)) {
			//				dup.add(i);
			//			}
			//			else {
			//				dis.add(i);
			//			}

			if(dis.add(i)==false) {
				//System.out.print (i+" ");
			}

		});

	//	System.out.println(dup);
		
		
		Arrays.stream(arr1).filter(i->
			 i.matches("a.*")
		).forEach(i->System.out.println("here are words ---"+i));

	}


	public static void common() {
		int[]  arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {2, 3, 4, 7, 8};

		List<Integer> a=Arrays.stream(arr2).boxed().collect(Collectors.toList());
		//System.out.println(Arrays.asList(arr2));
		Arrays.stream(arr1).forEach(i->{


			if(a.contains(i)) {
				System.out.print (i+" ");
			}
		});


	}

	public static void smallest()
	{
		int[] inputArr = {10,43,27,98,75,59,191};

		
		System.out.println(Arrays.stream(inputArr).sorted().min().getAsInt());
		System.out.println(Arrays.stream(inputArr).sorted().max().getAsInt());
	}

	public static void reverse(String myArray[]) {

		//int[] myArray = {10,43,27,98,75,59,191};

		//Arrays.stream(inputArr).sorted().forEach(i->System.out.print(i+" "));

		//	Arrays.stream(inputArr).boxed().collect(Collectors.toList());

		System.out.println("=============================");
		//		Collections.reverse(Arrays.stream(inputArr).boxed().collect(Collectors.toList()));
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array:" + Arrays.asList(myArray));
	}

	public static void sum() {

		int[] inputArr = {10,43,27,98,75,59,191};

		System.out.println( Arrays.stream(inputArr).sum());
	}

	public static void firstRepeat() {

		int[] arr = new int[]{1,2,3,4,5,7,4,9};

		int rep=0;

		HashSet<Integer> dis= new HashSet<>();
		
		

		Arrays.stream(arr).forEach(i->{

			if(dis.contains(i)) {
				System.out.println(i);
			}
			else {
				dis.add(i);
			}
		});
	}
	
	public static void thirdlargest() {
		
		int[] arr = new int[]{1,2,3,4,5,7,4,9};
		
				Arrays.stream(arr).sorted().distinct().toArray();
		
				System.out.println(arr[arr.length-2]);
				
				LinkedList<String> li= new LinkedList<>();
				
		
	}
	
	
	
	

}
