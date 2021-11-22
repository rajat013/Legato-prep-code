package amdocs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
//		int ar []=  {1,3,5,36,34,7};
//		
//		
//		System.out.println(Arrays.stream(ar).sorted().toArray()[ar.length-2]);
//			
//		System.out.println(ar.hashCode());
//		
//		String a= null;
//		System.out.println(a.hashCode());
//		
//		ArrayList<String> aa= new ArrayList<String>();
//		aa.add("rajat");
//		aa.add("satish");
		
		int[]  arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {2, 3, 4, 7, 8};

		List<Integer> a=Arrays.stream(arr2).boxed().collect(Collectors.toList());
		//System.out.println(Arrays.asList(arr2));
		Arrays.stream(arr1).forEach(i->{


			if(a.contains(i)) {
				//System.out.print (i+" ");
			}
		});
			
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("rajat", 1);
		hm.entrySet().stream().forEach(i->System.out.println(i.getKey()+" "+ i.getValue()));
		
		String ab = "rajat";
		ab.length();
		
		//System.out.println(Arrays.toString(ar));
	}

}
