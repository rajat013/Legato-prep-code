package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class ArrayOp {
	public static void main(String[] args) {

		ArrayList<String> ar= new ArrayList<String>();

		ar.add("rajat");
		ar.add("anuj");
		ar.add("akash");
		ar.add("satish");
		//	ar.add(null);
		
		
		System.out.println(ar.size());
		int size=ar.size();
		
		size=0;
		System.out.println(ar.size());
		System.out.println(ar);

		
		Iterator<String> it= ar.listIterator(ar.size());		

	//	System.out.println(it.next());
//		it.remove();
//		ar.remove(2);
//		System.out.println(ar);


		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "rajat");
		hm.put(2, "anuj");
		hm.put(3, "akash");
		hm.put(4, "akash");

		
		
		//System.out.println(hm);
		
		hm.entrySet().forEach(i->{
		
			
			
		});
		

		//System.out.println(hm.entrySet().);




		//IntStream.iterate(3,i->i+1).limit(11).forEach(i->System.out.println(i));
		
		int a= IntStream.rangeClosed(3, 11)
		.filter(i->i%2!=0)
		.max().getAsInt();
		//.forEach(i->System.out.println(i));
//System.out.println(a*a);


		

	}

}
