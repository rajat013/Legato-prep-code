package java8Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaImpl {

	public static void main(String ar[]) {
//		
//		Lamda lamda = (int a,int b)->{
//			return a+b;
//	};
//	
//	System.out.println(lamda.sum(1, 2));
//	
	
	

    List<String> list = new ArrayList<String>();
    list.add("aket");
    list.add("aurav");
    list.add("oftwaretestinghelp");
    list.add("teve");
    
    
    list.stream().filter(i->i.startsWith("a")).forEach(i->System.out.println(i));
		
	}
}
